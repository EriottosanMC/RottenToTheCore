package io.github.eriottosanmc.rottentothecore.common.event;


import java.util.Optional;

import io.github.eriottosanmc.rottentothecore.RottenToTheCore;
import io.github.eriottosanmc.rottentothecore.common.block.CustomWeatheringCopper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LightningRodBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.event.VanillaGameEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = RottenToTheCore.MODID, bus = Bus.FORGE)
public class CommonVanillaEventsHandler {

    @SubscribeEvent
    public static void test(VanillaGameEvent event) {
        if(event.getVanillaEvent() == GameEvent.LIGHTNING_STRIKE) {
        	BlockPos pos = new BlockPos(event.getEventPosition()).below();
        	clearCopperOnLightningStrike(event.getLevel(), pos);
        }
    }
    
    
    private static void clearCopperOnLightningStrike(Level pLevel, BlockPos pPos) {
        BlockState blockstate = pLevel.getBlockState(pPos);
        BlockPos blockpos;
        BlockState blockstate1;
        if (blockstate.is(Blocks.LIGHTNING_ROD)) {
           blockpos = pPos.relative(blockstate.getValue(LightningRodBlock.FACING).getOpposite());
           blockstate1 = pLevel.getBlockState(blockpos);
        } else {
           blockpos = pPos;
           blockstate1 = blockstate;
        }

        if (blockstate1.getBlock() instanceof CustomWeatheringCopper) {
           pLevel.setBlockAndUpdate(blockpos, CustomWeatheringCopper.getFirst(pLevel.getBlockState(blockpos)));
           BlockPos.MutableBlockPos blockpos$mutableblockpos = pPos.mutable();
           int i = pLevel.random.nextInt(3) + 3;

           for(int j = 0; j < i; ++j) {
              int k = pLevel.random.nextInt(8) + 1;
              randomWalkCleaningCopper(pLevel, blockpos, blockpos$mutableblockpos, k);
           }

        }
     }

     private static void randomWalkCleaningCopper(Level pLevel, BlockPos pPos, BlockPos.MutableBlockPos pMutable, int pSteps) {
        pMutable.set(pPos);

        for(int i = 0; i < pSteps; ++i) {
           Optional<BlockPos> optional = randomStepCleaningCopper(pLevel, pMutable);
           if (!optional.isPresent()) {
              break;
           }

           pMutable.set(optional.get());
        }

     }
     
     private static Optional<BlockPos> randomStepCleaningCopper(Level p_147154_, BlockPos p_147155_) {
         for(BlockPos blockpos : BlockPos.randomInCube(p_147154_.random, 10, p_147155_, 1)) {
            BlockState blockstate = p_147154_.getBlockState(blockpos);
            if (blockstate.getBlock() instanceof CustomWeatheringCopper) {
            	CustomWeatheringCopper.getPrevious(blockstate).ifPresent((p_147144_) -> {
                  p_147154_.setBlockAndUpdate(blockpos, p_147144_);
               });
               p_147154_.levelEvent(3002, blockpos, -1);
               return Optional.of(blockpos);
            }
         }

         return Optional.empty();
      }

}

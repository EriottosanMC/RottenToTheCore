package io.github.eriottosanmc.rottentothecore.common.message;

import java.util.function.Supplier;

import io.github.eriottosanmc.rottentothecore.client.data.ClientThoughtsData;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraftforge.network.NetworkEvent;

public class ClientboundPacketThoughts {
	private MutableComponent message = Component.translatable("");

	public ClientboundPacketThoughts(MutableComponent message) {
		this.message = message;
	}

	public ClientboundPacketThoughts(FriendlyByteBuf buf) {
		this.message = (MutableComponent) buf.readComponent();
	}

	public void toBytes(FriendlyByteBuf buf) {
		buf.writeComponent(this.message);
	}

	public boolean handle(Supplier<NetworkEvent.Context> supplier) {
		NetworkEvent.Context ctx = supplier.get();
		ctx.enqueueWork(() -> {
			// Here we are client side.
			// Be very careful not to access client-only classes here! (like Minecraft)
			// because
			// this packet needs to be available server-side too
			ClientThoughtsData.changeThought(this.message);
		});
		return true;
	}
}

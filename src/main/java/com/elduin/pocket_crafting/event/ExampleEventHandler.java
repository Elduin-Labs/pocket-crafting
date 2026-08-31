package com.elduin.pocket_crafting.event;

import com.elduin.pocket_crafting.ModTemplate;
import net.minecraft.server.level.ServerPlayer;

public class ExampleEventHandler {

	public static void onPlayerHurt(ServerPlayer player) {
		ModTemplate.LOGGER.info("{} took damage.", player.getDisplayName());
	}
}

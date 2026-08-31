package com.elduin.pocket_crafting.platform.fabric;

//? fabric {

import com.elduin.pocket_crafting.ModTemplate;
import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.api.ModInitializer;

@Entrypoint("main")
public class FabricEntrypoint implements ModInitializer {

	@Override
	public void onInitialize() {
		ModTemplate.onInitialize();
		FabricEventSubscriber.registerEvents();
	}
}
//?}

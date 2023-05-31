package me.momokinou.tutorial;

import me.momokinou.tutorial.block.ModBlocks;
import me.momokinou.tutorial.item.ModItemGroup;
import me.momokinou.tutorial.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
    public static final String MOD_ID = "tutorial";
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorial");

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemsGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
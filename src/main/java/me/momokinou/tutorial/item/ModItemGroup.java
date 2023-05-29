package me.momokinou.tutorial.item;

import me.momokinou.tutorial.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CITRINE;

    public static void registerItemsGroups() {
        CITRINE = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "citrine"))
                .displayName(Text.translatable("itemgroup.citrine"))
                .icon(() -> new ItemStack(ModItems.CITRINE))
                .build();
    }
}

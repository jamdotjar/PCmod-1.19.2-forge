package com.jamdotjar.pcmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabs {
    public static final CreativeModeTab PC_COMPONENTS = new CreativeModeTab("pc_components") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GPU.get());
        }
    };
    public static final CreativeModeTab PC_CRAFTING_ITEMS = new CreativeModeTab("pc_crafting_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TRANSISTOR.get());
        }
    };
}

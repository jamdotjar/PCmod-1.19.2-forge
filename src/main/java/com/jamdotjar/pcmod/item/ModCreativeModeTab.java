package com.jamdotjar.pcmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PC_COMPONENTS = new CreativeModeTab("pc_components") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CPU.get());
        }
    };
}

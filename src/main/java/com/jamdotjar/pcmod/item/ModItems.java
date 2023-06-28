package com.jamdotjar.pcmod.item;

import com.google.common.eventbus.EventBus;
import com.jamdotjar.pcmod.Pcmod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Pcmod.MOD_ID);

    public static final RegistryObject<Item> CPU = ITEMS.register("cpu", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PC_COMPONENTS)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

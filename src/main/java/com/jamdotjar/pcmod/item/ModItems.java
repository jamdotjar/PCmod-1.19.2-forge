package com.jamdotjar.pcmod.item;

import com.jamdotjar.pcmod.Pcmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Pcmod.MOD_ID);

    // --- Item Definitions ---

    // - Components -
    public static final RegistryObject<Item> CPU = ITEMS.register("cpu", () -> new Item(new Item.Properties().tab(CreativeTabs.PC_COMPONENTS)));

    public static final RegistryObject<Item> GPU = ITEMS.register("gpu", () -> new Item(new Item.Properties().tab(CreativeTabs.PC_COMPONENTS)));

    public static final RegistryObject<Item> RAM = ITEMS.register("ram", () -> new Item(new Item.Properties().tab(CreativeTabs.PC_COMPONENTS)));
    public static final RegistryObject<Item> SSD_SATA = ITEMS.register("ssd_sata", () -> new Item(new Item.Properties().tab(CreativeTabs.PC_COMPONENTS)));

    public static final RegistryObject<Item> PC_FAN = ITEMS.register("pc_fan", () -> new Item(new Item.Properties().tab(CreativeTabs.PC_COMPONENTS)));
    public static final RegistryObject<Item> HDD = ITEMS.register("hdd", () -> new Item(new Item.Properties().tab(CreativeTabs.PC_COMPONENTS)));
    // - Crafting Items -
    public static final RegistryObject<Item> TRANSISTOR = ITEMS.register("transistor", () -> new Item(new Item.Properties().tab(CreativeTabs.PC_CRAFTING_ITEMS)));


    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon", () -> new Item(new Item.Properties().tab(CreativeTabs.PC_CRAFTING_ITEMS)));
    // --- Item Registration ---
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

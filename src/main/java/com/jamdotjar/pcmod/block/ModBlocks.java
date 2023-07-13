package com.jamdotjar.pcmod.block;

import com.jamdotjar.pcmod.Pcmod;
import com.jamdotjar.pcmod.block.custom.RefineryBlock;
import com.jamdotjar.pcmod.fluid.ModFluids;
import com.jamdotjar.pcmod.item.CreativeTabs;
import com.jamdotjar.pcmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class
ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Pcmod.MOD_ID);


    public static final RegistryObject<Block> SILICON_BLOCK = registerBlock("silicon_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), CreativeTabs.PC_CRAFTING_ITEMS);

    public static final RegistryObject<Block> REFINERY = registerBlock("refinery",
            () -> new RefineryBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops().noOcclusion()), CreativeTabs.PC_CRAFTING_ITEMS);

    public static final RegistryObject<LiquidBlock> CRUDE_OIL_BLOCK = BLOCKS.register("crude_oil_block",
            () -> new LiquidBlock(ModFluids.SOURCE_CRUDE_OIL, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> REFINED_CRUDE_OIL_BLOCK = BLOCKS.register("refined_crude_oil_block",
            () -> new LiquidBlock(ModFluids.SOURCE_REFINED_CRUDE_OIL, BlockBehaviour.Properties.copy(Blocks.WATER)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

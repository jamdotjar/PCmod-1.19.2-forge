package com.jamdotjar.pcmod.fluid;

import com.jamdotjar.pcmod.Pcmod;
import com.jamdotjar.pcmod.block.ModBlocks;
import com.jamdotjar.pcmod.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, Pcmod.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_REFINED_CRUDE_OIL = FLUIDS.register("refined_crude_oil_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.REFINED_CRUDE_OIL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_REFINED_CRUDE_OIL = FLUIDS.register("flowing_refined_crude_oil",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.REFINED_CRUDE_OIL_FLUID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties REFINED_CRUDE_OIL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.REFINED_CRUDE_OIL_FLUID_TYPE, SOURCE_REFINED_CRUDE_OIL, FLOWING_REFINED_CRUDE_OIL).slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.REFINED_CRUDE_OIL_BLOCK).bucket(ModItems.REFINED_CRUDE_OIL_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_CRUDE_OIL = FLUIDS.register("crude_oil_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.CRUDE_OIL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_CRUDE_OIL = FLUIDS.register("crude_oil",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.CRUDE_OIL_FLUID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties CRUDE_OIL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.CRUDE_OIL_FLUID_TYPE, SOURCE_CRUDE_OIL, FLOWING_CRUDE_OIL).slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.CRUDE_OIL_BLOCK).bucket(ModItems.CRUDE_OIL_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}

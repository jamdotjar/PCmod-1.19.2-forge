package com.jamdotjar.pcmod.fluid;

import com.jamdotjar.pcmod.Pcmod;
import com.mojang.math.Vector3f;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation CRUDE_OIL_OVERLAY_RL = new ResourceLocation(Pcmod.MOD_ID, "misc/in_crude_oil");


    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Pcmod.MOD_ID);

    public static final RegistryObject<FluidType> REFINED_CRUDE_OIL_FLUID_TYPE = register("refined_crude_oil_fluid",
            FluidType.Properties.create().lightLevel(2).density(2).viscosity(7));
    public static final RegistryObject<FluidType> CRUDE_OIL_FLUID_TYPE = register("crude_oil_fluid",
            FluidType.Properties.create().lightLevel(2).density(2).viscosity(7));
    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, CRUDE_OIL_OVERLAY_RL, 0xFC121212, new Vector3f(18f/255f, 18f/255f, 18/255f), properties ));
    }
    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}

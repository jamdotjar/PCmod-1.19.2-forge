package com.jamdotjar.pcmod;

import com.jamdotjar.pcmod.block.ModBlocks;
import com.jamdotjar.pcmod.block.entity.ModBlockEntities;
import com.jamdotjar.pcmod.fluid.ModFluidTypes;
import com.jamdotjar.pcmod.fluid.ModFluids;
import com.jamdotjar.pcmod.item.ModItems;
import com.jamdotjar.pcmod.screen.ModMenuTypes;
import com.jamdotjar.pcmod.screen.RefineryScreen;
import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Pcmod.MOD_ID)
public class Pcmod {

    public static final String MOD_ID = "pcmod";

    private static final Logger LOGGER = LogUtils.getLogger();


    public Pcmod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        ModBlockEntities.register(modEventBus);


        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);


    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {


            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_REFINED_CRUDE_OIL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_REFINED_CRUDE_OIL.get(), RenderType.translucent());

            MenuScreens.register(ModMenuTypes.REFINERY_MENU.get(), RefineryScreen::new);
        }
    }
}

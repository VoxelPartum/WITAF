package net.voxelpartum.witaf;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.voxelpartum.witaf.registry.*;

@Mod(WITAF.MODID)
public class WITAF
{
    public static final String MODID = "witaf";

    public WITAF()
    {
        //Misc Forge Loading stuff.
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus eventBus = MinecraftForge.EVENT_BUS;
        modEventBus.addListener(this::commonSetup);

        //Registers Creative Mode Tab.
        WITAFCreativeTab.CREATIVE_TAB.register(modEventBus);

        //Overrides the vanilla block(s).
        VanillaBlockOverrides.BLOCKS.register(modEventBus);
        //Registers the custom blocks and items.
        WITAFBlocks.BLOCKS.register(modEventBus);
        WITAFItems.ITEMS.register(modEventBus);

        //Registers the entity(s).
        WITAFEntitys.ENTITIES.register(modEventBus);

        eventBus.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}

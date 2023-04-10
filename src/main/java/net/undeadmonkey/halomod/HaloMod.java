package net.undeadmonkey.halomod;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.undeadmonkey.halomod.item.custom.HaloItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(HaloMod.MOD_ID)
public class HaloMod {

    public static HaloItems ITEMS;
    public static final String MOD_ID = "halomod";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public HaloMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        HaloItems.register(eventBus);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}

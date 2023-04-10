package net.undeadmonkey.halomod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.undeadmonkey.halomod.HaloMod;
import net.undeadmonkey.halomod.item.HaloCreativeModeTab;

public class HaloItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HaloMod.MOD_ID);

    public static final RegistryObject<Item> ENERGY_SWORD = ITEMS.register("energy_sword",
            () -> new Item(new Item.Properties().tab(HaloCreativeModeTab.HALO_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

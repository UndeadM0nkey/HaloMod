package net.undeadmonkey.halomod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.undeadmonkey.halomod.item.custom.HaloItems;

public class HaloCreativeModeTab {
    public static final CreativeModeTab HALO_TAB = new CreativeModeTab("halotab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(HaloItems.ENERGY_SWORD.get());
        }
    };
}

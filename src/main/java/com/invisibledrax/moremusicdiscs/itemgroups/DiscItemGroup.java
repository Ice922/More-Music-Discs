package com.invisibledrax.moremusicdiscs.itemgroups;

import com.invisibledrax.moremusicdiscs.setup.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DiscItemGroup extends ItemGroup {

    public DiscItemGroup(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return ModItems.LOKI_THEME_DISC.get().getDefaultInstance();
    }
}

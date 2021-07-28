package com.invisibledrax.moremusicdiscs.lists;

import com.invisibledrax.moremusicdiscs.MoreMusicDiscs;
import com.invisibledrax.moremusicdiscs.itemtypes.CustomMusicDisc;
import com.invisibledrax.moremusicdiscs.util.ListBuilder;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreMusicDiscs.MOD_ID);

    public static final RegistryObject<Item> LOKI_THEME_DISC = ITEMS.register("loki_theme_disc",
            () -> new CustomMusicDisc(SoundList.LOKI_THEME_DISC_SOUND,
                    new ListBuilder<String>().add("Natalie Holt - Loki Green Theme").add("Cover by: InvisibleDrax").build()));
}

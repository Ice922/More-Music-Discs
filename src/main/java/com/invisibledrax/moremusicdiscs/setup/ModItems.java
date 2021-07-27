package com.invisibledrax.moremusicdiscs.setup;

import com.invisibledrax.moremusicdiscs.MoreMusicDiscs;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreMusicDiscs.MOD_ID);

    public static final RegistryObject<MusicDiscItem> LOKI_THEME_DISC = ITEMS.register("loki_theme_disc",
            () ->
            new MusicDiscItem(1, () -> ModSounds.LOKI_THEME_DISC.get(),
                    new MusicDiscItem.Properties().group(MoreMusicDiscs.DISC_ITEM_GROUP).maxStackSize(1).group(MoreMusicDiscs.DISC_ITEM_GROUP)));
}

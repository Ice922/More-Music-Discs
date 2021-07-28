package com.invisibledrax.moremusicdiscs.setup;

import com.invisibledrax.moremusicdiscs.MoreMusicDiscs;
import com.invisibledrax.moremusicdiscs.lists.ItemList;
import com.invisibledrax.moremusicdiscs.lists.SoundList;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class Registration {
    private static final String MOD_ID = MoreMusicDiscs.MOD_ID;

    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemList.ITEMS.register(modEventBus);
        SoundList.SOUNDS.register(modEventBus);
    }

}

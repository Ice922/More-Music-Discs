package com.invisibledrax.moremusicdiscs.lists;

import com.invisibledrax.moremusicdiscs.MoreMusicDiscs;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundList {

    private static final String MOD_ID = MoreMusicDiscs.MOD_ID;

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MOD_ID);

    public static final RegistryObject<SoundEvent> LOKI_THEME_DISC_SOUND =
            SOUNDS.register("loki_green_theme_sound", () -> new SoundEvent(new ResourceLocation(MOD_ID, "loki_green_theme_sound")));
}
package com.invisibledrax.moremusicdiscs.setup;

import com.invisibledrax.moremusicdiscs.MoreMusicDiscs;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoreMusicDiscs.MOD_ID);

    public static final RegistryObject<SoundEvent> LOKI_THEME_DISC =
            SOUNDS.register("loki_green_theme", () -> new SoundEvent(new ResourceLocation(MoreMusicDiscs.MOD_ID, "loki_green_theme")));
}
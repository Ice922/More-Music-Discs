package com.invisibledrax.moremusicdiscs.itemtypes;

import com.invisibledrax.moremusicdiscs.MoreMusicDiscs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CustomMusicDisc extends MusicDiscItem {

    private List<String> lore;

    public CustomMusicDisc(Supplier<SoundEvent> soundSupplier, List<String> lore) {
        super(1, soundSupplier, new Item.Properties().group(MoreMusicDiscs.DISC_ITEM_GROUP).maxStackSize(1));
        this.lore = lore;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.remove(tooltip.size() - 1);
        List<ITextComponent> iTextComponents = new ArrayList<>();
        for (String line : lore) {
            iTextComponents.add(new StringTextComponent(line).mergeStyle(TextFormatting.GRAY));
        }
        tooltip.addAll(iTextComponents);
    }
}

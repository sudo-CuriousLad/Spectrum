package de.dafuqs.spectrum.compat.REI.plugins;

import de.dafuqs.spectrum.compat.REI.SpectrumPlugins;
import de.dafuqs.spectrum.registries.SpectrumBlocks;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class HeatingCategory extends BlockToBlockWithChanceCategory {
	
	@Override
	public CategoryIdentifier<? extends HeatingDisplay> getCategoryIdentifier() {
		return SpectrumPlugins.HEATING;
	}
	
	@Override
	public Renderer getIcon() {
		return EntryStacks.of(SpectrumBlocks.BLAZE_MOB_BLOCK);
	}
	
	@Override
	public Text getTitle() {
		return new TranslatableText("container.spectrum.rei.heating.title");
	}
	
}

package me.datsuns.neoforge;

import me.datsuns.common.MultiLoaderTemplate;
import net.neoforged.fml.common.Mod;

@Mod(MultiLoaderTemplate.MOD_ID)
public final class MultiLoaderTemplateNeoForge {
    public MultiLoaderTemplateNeoForge() {
        MultiLoaderTemplate.init();
    }
}

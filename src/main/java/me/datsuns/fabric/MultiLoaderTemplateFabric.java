package me.datsuns.fabric;

import me.datsuns.common.MultiLoaderTemplate;
import net.fabricmc.api.ModInitializer;

public final class MultiLoaderTemplateFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MultiLoaderTemplate.init();
    }
}

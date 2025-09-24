package me.datsuns.fabric;

import me.datsuns.common.MultiLoaderTemplateClient;
import net.fabricmc.api.ClientModInitializer;

public final class MultiLoaderTemplateFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MultiLoaderTemplateClient.init();
    }
}

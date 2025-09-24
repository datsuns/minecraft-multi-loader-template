package me.datsuns.neoforge;

import me.datsuns.common.MultiLoaderTemplate;
import me.datsuns.common.MultiLoaderTemplateClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MultiLoaderTemplate.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class MultiLoaderTemplateNeoForgeClient {
    private MultiLoaderTemplateNeoForgeClient() {
    }

    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(MultiLoaderTemplateClient::init);
    }
}

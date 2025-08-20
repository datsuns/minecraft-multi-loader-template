package com.example.multiloader;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiLoaderMod implements ModInitializer {
    public static final String MOD_ID = "multiloader";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello from MultiLoaderMod! (Fabric) - Minecraft 1.21.8");
    }
}

package me.datsuns.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class MultiLoaderTemplate {
    public static final String MOD_ID = "multiloader-template";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private MultiLoaderTemplate() {
    }

    public static void init() {
        LOGGER.info("Hello multi-loader world!");
    }
}

package com.example.fabric;

import net.fabricmc.api.ModInitializer;
import com.example.ExampleMod;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleMod.init();
    }
}


package com.example.mymod.fabric;

import net.fabricmc.api.ModInitializer;
import com.example.mymod.modcommon.MyMod;

public final class MyModFabric implements ModInitializer {
  @Override public void onInitialize() { MyMod.init(); }
}

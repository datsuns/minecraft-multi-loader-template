
package com.example.mymod.quilt;

import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.loader.api.ModContainer;
import com.example.mymod.modcommon.MyMod;

public final class MyModQuilt implements ModInitializer {
  @Override public void onInitialize(ModContainer mod) { MyMod.init(); }
}

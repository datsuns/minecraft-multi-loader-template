
package com.example.mymod.forge;

import net.minecraftforge.fml.common.Mod;
import com.example.mymod.modcommon.MyMod;

@Mod(com.example.mymod.modcommon.MyMod.MOD_ID)
public final class MyModForge {
  public MyModForge() { MyMod.init(); }
}

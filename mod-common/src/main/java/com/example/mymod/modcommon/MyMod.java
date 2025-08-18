
package com.example.mymod.modcommon;

import com.example.mymod.core.Core;

public final class MyMod {
  public static final String MOD_ID = "examplemod";
  private MyMod() { }
  public static void init() {
    System.out.println("[" + MOD_ID + "] init - " + Core.hello());
  }
}

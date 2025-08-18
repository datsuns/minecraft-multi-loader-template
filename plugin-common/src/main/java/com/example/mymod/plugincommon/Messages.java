
package com.example.mymod.plugincommon;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public final class Messages {
  private static final MiniMessage mm = MiniMessage.miniMessage();
  private Messages() { }
  public static Component hello() { return mm.deserialize("<green>[examplemod]</green> <gray>Hello from plugin-common</gray>"); }
}

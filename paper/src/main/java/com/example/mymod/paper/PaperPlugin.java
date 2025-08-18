
package com.example.mymod.paper;

import org.bukkit.plugin.java.JavaPlugin;
import net.kyori.adventure.text.Component;
import com.example.mymod.plugincommon.Messages;

public final class PaperPlugin extends JavaPlugin {
  @Override public void onEnable() {
    Component c = Messages.hello();
    getLogger().info(c.toString());
  }
}

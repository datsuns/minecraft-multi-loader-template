
package com.example.mymod.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;
import com.example.mymod.plugincommon.Messages;

@Plugin(id="examplemod", name="Example Mod Velocity", version="0.1.0", authors = "YourName")
public final class VelocityPlugin {
  @Inject
  public VelocityPlugin(ProxyServer server, Logger logger) {
    logger.info(Messages.hello().toString());
  }
}

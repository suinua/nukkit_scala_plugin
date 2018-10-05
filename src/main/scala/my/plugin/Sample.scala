package my.plugin


import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerJoinEvent
import cn.nukkit.plugin.PluginBase


class Sample extends PluginBase with Listener{

  override def onEnable(): Unit = {
    this.getServer.getPluginManager.registerEvents(this, this)
  }

  @EventHandler def onPlayerJoin(event: PlayerJoinEvent): Unit = {
    event.getPlayer.sendMessage("Hello, World.")
  }
}
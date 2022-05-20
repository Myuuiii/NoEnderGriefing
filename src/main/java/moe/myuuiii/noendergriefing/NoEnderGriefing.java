package moe.myuuiii.noendergriefing;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoEnderGriefing extends JavaPlugin implements Listener {

    public static boolean enabled = true;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
        enabled = getConfig().getBoolean("enabled");

        this.saveDefaultConfig();

        getCommand("noendergriefing").setExecutor(new EnderGriefingCommand(this));
        getCommand("noendergriefing").setTabCompleter(new EnderGriefingCommandCompleter());
    }

    @Override
    public void onDisable() {
        getConfig().set("enabled", NoEnderGriefing.enabled);
        this.saveConfig();
    }

    @EventHandler
    public void onEntityChangeBlock(EntityChangeBlockEvent e) {
        if (e.getEntity() == null)
            return;

        if (e.getEntity().getType() == EntityType.ENDERMAN) {
            if (enabled) {
                e.setCancelled(true);
            }
            return;
        }
    }
}

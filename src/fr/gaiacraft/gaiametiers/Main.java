package fr.gaiacraft.gaiametiers;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JobBucheron(), this);
        getServer().getPluginManager().registerEvents(new JobMineur(), this);
    }

    @Override
    public void onDisable() {
        HandlerList.unregisterAll(new JobBucheron());
        HandlerList.unregisterAll(new JobMineur());
    }
}

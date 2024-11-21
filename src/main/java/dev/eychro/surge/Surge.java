package dev.eychro.surge;

import dev.eychro.surge.Utils.UserHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class Surge extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new UserHandler(), this);
    }

    @Override
    public void onDisable() {

    }
}

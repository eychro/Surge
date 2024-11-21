package dev.eychro.surge;

import dev.eychro.surge.Commands.User.Fly;
import dev.eychro.surge.Utils.UserHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class Surge extends JavaPlugin {

    @Override
    public void onEnable() {

        commandLoader();
        listenerLoader();
    }

    public void listenerLoader() {
        getServer().getPluginManager().registerEvents(new UserHandler(), this);
    }
    public void commandLoader() {
        getCommand("Fly").setExecutor(new Fly());
    }

}

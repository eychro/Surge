package dev.eychro.surge;

import dev.eychro.surge.Commands.Player.SurgeCommand;
import dev.eychro.surge.Commands.Staff.Build;
import dev.eychro.surge.Commands.Staff.SetSpawn;
import dev.eychro.surge.Commands.Player.Fly;


import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


public final class Surge extends JavaPlugin {
    @Override
    public void onEnable() {
    
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "---------------------------------");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "|             " + ChatColor.RED + "SURGE" + ChatColor.DARK_GRAY + "             |");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "|                               |");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "| " + ChatColor.RED + "Status: " + ChatColor.GREEN + "ACTIVATED" + ChatColor.DARK_GRAY + "             |");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "| " + ChatColor.RED + "Version: " + ChatColor.WHITE + getDescription().getVersion() + ChatColor.DARK_GRAY + "                |");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "|                               |");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY +"---------------------------------");

        this.registerCommands();

    }

    @Override
    public void onDisable() {



    }

    private void registerCommands() {
        this.getCommand("fly").setExecutor(new Fly());
        this.getCommand("Build").setExecutor(new Build());
        this.getCommand("setspawn").setExecutor(new SetSpawn());
        this.getCommand("surge").setExecutor(new SurgeCommand(this));
    }

}

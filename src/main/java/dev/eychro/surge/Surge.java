package dev.eychro.surge;

import dev.eychro.surge.Commands.Player.Fly;

import dev.eychro.surge.Commands.Staff.Vanish;
import dev.eychro.surge.Commands.Staff.Reload;
import dev.eychro.surge.Handlers.CustomConfiguration;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


public final class Surge extends JavaPlugin {
    @Override
    public void onEnable() {

        //Message when enabled
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "---------------------------------");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "             " + ChatColor.RED + getDescription().getName() + ChatColor.DARK_GRAY + "             ");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "                               ");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + " " + ChatColor.RED + "Status: " + ChatColor.GREEN + "ACTIVATED" + ChatColor.DARK_GRAY + "             ");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + " " + ChatColor.RED + "Version: " + ChatColor.WHITE + getDescription().getVersion() + ChatColor.DARK_GRAY + "                ");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "                               ");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "            " + ChatColor.GRAY + "EYCHRO" + ChatColor.DARK_GRAY + "            ");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY +"---------------------------------");

        //Config
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        CustomConfiguration.Setup();
        CustomConfiguration.get().options().copyDefaults(true);
        CustomConfiguration.save();

        //Commands
        this.registerCommands();
    }

    @Override
    public void onDisable() {

        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "---------------------------------");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "             " + ChatColor.RED + getDescription().getName() + ChatColor.DARK_GRAY + "             ");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "                               ");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + " " + ChatColor.RED + "Status: " + ChatColor.GREEN + "DEACTIVATED" + ChatColor.DARK_GRAY + "             ");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + " " + ChatColor.RED + "Version: " + ChatColor.WHITE + getDescription().getVersion() + ChatColor.DARK_GRAY + "                ");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "                               ");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY +"---------------------------------");

    }

    private void registerCommands() {
        this.getCommand("fly").setExecutor(new Fly());
        this.getCommand("reload").setExecutor(new Reload());
        this.getCommand("vanish").setExecutor(new Vanish());
    }

}

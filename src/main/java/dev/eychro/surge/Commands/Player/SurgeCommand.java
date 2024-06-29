package dev.eychro.surge.Commands.Player;

import org.bukkit.ChatColor;
import dev.eychro.surge.Surge;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SurgeCommand implements CommandExecutor {

    private Surge surge;

    public SurgeCommand(Surge plugin) {
        this.surge = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            sender.sendMessage(ChatColor.DARK_GRAY.toString() + ChatColor.STRIKETHROUGH + "                                  ");
            sender.sendMessage(ChatColor.DARK_GRAY + "|            " + ChatColor.RED.toString() + ChatColor.BOLD + this.surge.getDescription().getName() + ChatColor.DARK_GRAY + "             |");
            sender.sendMessage(ChatColor.DARK_GRAY + "|                                |");
            sender.sendMessage(ChatColor.DARK_GRAY + "| "+ ChatColor.RED + "Version: " + ChatColor.WHITE + this.surge.getDescription().getVersion() + ChatColor.DARK_GRAY + "              |");
            sender.sendMessage(ChatColor.DARK_GRAY + "| " + ChatColor.RED +  "Author: " + ChatColor.WHITE + "Eychro" + ChatColor.DARK_GRAY + "             |");
            sender.sendMessage(ChatColor.DARK_GRAY.toString() + ChatColor.STRIKETHROUGH + "                                  ");

        } else {
            sender.sendMessage(ChatColor.DARK_GRAY.toString() + ChatColor.STRIKETHROUGH + "                               ");
            sender.sendMessage(ChatColor.DARK_GRAY + "|            " + ChatColor.RED.toString() + ChatColor.BOLD + this.surge.getDescription().getName() + ChatColor.DARK_GRAY + "            |");
            sender.sendMessage(ChatColor.DARK_GRAY + "|                             |");
            sender.sendMessage(ChatColor.DARK_GRAY + "| "+ ChatColor.RED + "Version: " + ChatColor.WHITE + this.surge.getDescription().getVersion() + ChatColor.DARK_GRAY + "              |");
            sender.sendMessage(ChatColor.DARK_GRAY + "| " + ChatColor.RED +  "Author: " + ChatColor.WHITE + "Eychro" + ChatColor.DARK_GRAY + "              |");
            sender.sendMessage(ChatColor.DARK_GRAY.toString() + ChatColor.STRIKETHROUGH + "                               ");

        }
        return true;
    }
}

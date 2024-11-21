package dev.eychro.surge.Commands.User;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            boolean f = ((Player) sender).getAllowFlight();
            if (sender.hasPermission("Surge.Fly")) {

                if (f = true) {
                    player.setAllowFlight(false);
                    sender.sendMessage(ChatColor.RED + "Fly disabled");
                } else {
                    sender.sendMessage(ChatColor.GREEN + "Fly enabled");
                }
            } else {
                sender.sendMessage(ChatColor.RED + "You don't have permission to execute this command");
            }
        } else {
            sender.sendMessage(ChatColor.RED + "You can't execute this command from console");
        }
        return true;
    }
}

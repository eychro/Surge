package dev.eychro.surge.Commands.Player;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Fly implements CommandExecutor {

    public static List<Player> fly = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (sender.hasPermission("Surge.fly")) {
                if(fly.contains(player)){
                    fly.remove(player);
                    player.sendMessage(ChatColor.RED + "Fly has been deactivated.");
                    player.setAllowFlight(false);
                } else {
                    fly.add(player);
                    player.sendMessage(ChatColor.GREEN + "Fly has been activated.");
                    player.setAllowFlight(true);
                }
            } else {

                sender.sendMessage(ChatColor.RED + "No permission.");

            }
        } else {

            sender.sendMessage(ChatColor.RED + "Only players can execute this command.");

        }

        return true;

    }
}

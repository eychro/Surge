package dev.eychro.surge.Commands.Player;

import dev.eychro.surge.Handlers.CustomConfiguration;
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
                    player.sendMessage(CustomConfiguration.get().getString("Prefix") + CustomConfiguration.get().getString("FlyDeactivate"));
                    player.setAllowFlight(false);
                } else {
                    fly.add(player);
                    player.sendMessage(CustomConfiguration.get().getString("Prefix") + CustomConfiguration.get().getString("FlyActivated"));
                    player.setAllowFlight(true);
                }
            } else {

                sender.sendMessage(CustomConfiguration.get().getString("Prefix") + CustomConfiguration.get().getString("NoPermission"));

            }
        } else {

            sender.sendMessage(CustomConfiguration.get().getString("Prefix") + CustomConfiguration.get().getString("OnlyPlayers"));

        }

        return true;

    }
}

package dev.eychro.surge.Commands.Staff;

import dev.eychro.surge.Handlers.CustomConfiguration;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Vanish implements CommandExecutor {

    public static List<Player> vanish = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {

            Player player = (Player) sender;

            if (sender.hasPermission("Surge.Vanish")) {
                if (vanish.contains(player)) {
                    vanish.remove(player);
                    player.setInvisible(true);
                    sender.sendMessage(CustomConfiguration.get().getString("Prefix") + CustomConfiguration.get().getString("VanishDisabled"));
                } else {
                    vanish.add(player);
                    player.setInvisible(false);
                    sender.sendMessage(CustomConfiguration.get().getString("Prefix") + CustomConfiguration.get().getString("VanishEnabled"));
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

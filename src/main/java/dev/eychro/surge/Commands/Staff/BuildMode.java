package dev.eychro.surge.Commands.Staff;

import dev.eychro.surge.Handlers.CustomConfiguration;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class BuildMode implements CommandExecutor {

    public static List<Player> BuildMode= new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            if (sender.hasPermission("Surge.BuildMode")){

                if (BuildMode.contains(player)) {
                    BuildMode.remove(player);
                    sender.sendMessage(CustomConfiguration.get().getString("Prefix") + CustomConfiguration.get().getString("BuildModeDeactivated"));
                } else {
                    BuildMode.add(player);
                    sender.sendMessage(CustomConfiguration.get().getString("Prefix") + CustomConfiguration.get().getString("BuildModeActivated"));
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

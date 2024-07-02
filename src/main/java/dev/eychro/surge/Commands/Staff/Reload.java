package dev.eychro.surge.Commands.Staff;

import dev.eychro.surge.Handlers.CustomConfiguration;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Reload implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender.hasPermission("Surge.Reload")) {
            CustomConfiguration.reload();
            sender.sendMessage(CustomConfiguration.get().getString("Prefix") + CustomConfiguration.get().getString("Reloaded"));
        } else {
            sender.sendMessage(CustomConfiguration.get().getString("Prefix") + CustomConfiguration.get().getString("NoPermission"));
        }
        return true;
    }
}

package dev.eychro.surge.Handlers;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class CustomConfiguration {

    private static File file;
    private static FileConfiguration config;

    public static void Setup() {
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("Surge").getDataFolder(), "config.yml");

        if (file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                //lol
            }
        }

        config = YamlConfiguration.loadConfiguration(file);

    }

    public static FileConfiguration get() {
        return config;
    }

    public static void save() {
        try {
            config.save(file);
        } catch (IOException e) {
            System.out.println("Couldn't save File.");
        }
    }

    public static void reload() {
        config = YamlConfiguration.loadConfiguration(file);
    }

}

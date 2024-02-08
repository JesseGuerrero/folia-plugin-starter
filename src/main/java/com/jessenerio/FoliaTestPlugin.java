package com.jessenerio;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class FoliaTestPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("FoliaTestPlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("FoliaTestPlugin has been disabled.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("testfolia")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("Hello from Folia Test Plugin!");
                return true;
            }
        }
        return false;
    }
}
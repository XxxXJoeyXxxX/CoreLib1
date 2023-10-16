package org.example;

import org.bukkit.plugin.java.JavaPlugin;

public class MyLibrary {
    public static void main(String[] args) {

    }
    private static JavaPlugin plugin;

    // For other classes in our library
    public static JavaPlugin getPlugin() {
        return plugin;
    }

    // This method must not be used any where in the library!
    public static void setPlugin(final JavaPlugin plugin) {
        MyLibrary.plugin = plugin;
    }
}
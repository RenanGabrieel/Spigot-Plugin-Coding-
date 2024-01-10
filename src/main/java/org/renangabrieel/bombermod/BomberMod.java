package org.renangabrieel.bombermod;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.renangabrieel.bombermod.command.BomberSpawnEggCommand;
import org.renangabrieel.bombermod.listener.InteractListener;

public final class BomberMod extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("givebomberspawnegg").setExecutor(new BomberSpawnEggCommand());

        Bukkit.getPluginManager().registerEvents(new InteractListener(this), this);

    }

}

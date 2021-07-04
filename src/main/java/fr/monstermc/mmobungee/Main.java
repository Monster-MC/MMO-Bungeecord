package fr.monstermc.mmobungee;

import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {

    private static Main instance;

    @Override
    public void onEnable() {
        getLogger().info("Activation du plugin...");
        instance = this;
        registration();
    }

    private void registration(){
        // register listeners

        //register commands
    }

    @Override
    public void onDisable() {
        getLogger().info("Desactivation du plugin");
    }

    public static Main getInstance() {
        return instance;
    }
}

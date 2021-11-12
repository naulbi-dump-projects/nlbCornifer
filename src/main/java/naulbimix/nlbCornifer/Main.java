package naulbimix.nlbCornifer;

import org.bukkit.event.*;
import org.bukkit.plugin.java.*;
import naulbimix.nlbCornifer.config.*;
import naulbimix.nlbCornifer.manager.*;
import naulbimix.nlbCornifer.commands.*;

public class Main extends JavaPlugin {

    private DataConfig dataConfig;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        dataConfig = new DataConfig(getConfig());
        getCommand("cornfer").setExecutor(new CommandCornfer(dataConfig));
        getCommand("cornifer").setExecutor(new CommandCornifer(dataConfig));
        System.out.println("[nlbCornifer] dai okyp! | version 1.3");
    }

    @Override
    public void onDisable() {
        getConfig().set("settings.players", MammonthManager.getClowns());
        HandlerList.unregisterAll(this);
    }
}

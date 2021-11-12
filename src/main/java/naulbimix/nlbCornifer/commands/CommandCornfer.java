package naulbimix.nlbCornifer.commands;

import naulbimix.nlbCornifer.manager.MammonthManager;
import org.bukkit.command.*;
import naulbimix.nlbCornifer.config.*;

public class CommandCornfer implements CommandExecutor {

    private DataConfig dataConfig;

    public CommandCornfer(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
    }

    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if(s.hasPermission(dataConfig.getPermsCornfer())) {
            if(args.length == 1 && args[0].equalsIgnoreCase("list")) {
                if(MammonthManager.getClowns().size() < 1) {
                    s.sendMessage(dataConfig.getCorniferNoPlayers());
                    return true;
                }
                MammonthManager.getClowns().forEach(clown -> s.sendMessage(dataConfig.getCornferList().replace("$player", clown)));
                return true;
            }
            s.sendMessage(dataConfig.getCornferUsage());
            return true;
        }
        s.sendMessage(dataConfig.getNoPermission());
        return true;
    }

}

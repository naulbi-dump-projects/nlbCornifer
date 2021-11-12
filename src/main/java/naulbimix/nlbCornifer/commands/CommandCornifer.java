package naulbimix.nlbCornifer.commands;

import naulbimix.nlbCornifer.manager.MammonthManager;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.*;
import naulbimix.nlbCornifer.config.*;
import org.bukkit.entity.Player;

public class CommandCornifer implements CommandExecutor {

    private DataConfig dataConfig;

    public CommandCornifer(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
    }

    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if(s.hasPermission(dataConfig.getPermsCornifer())) {
            if(args.length == 1) {
                if(args[0].replace(" ", "").length() <= 2) return suchkaOffline(s, null);
                if(MammonthManager.containsClown(args[0])) {
                    MammonthManager.yebatbClowna(args[0]);
                    s.sendMessage(dataConfig.getCorniferRemoved().replace("$player", args[0]));
                    return true;
                }
                Player neOkyp = Bukkit.getPlayer(args[0]);
                if(neOkyp == null) {
                    return suchkaOffline(s, args[0]);
                }
                MammonthManager.addClown(args[0]);
                s.sendMessage(dataConfig.getCorniferAdded().replace("$player", args[0]));
                return true;
            }
            s.sendMessage(dataConfig.getCorniferUsage());
            return true;
        }
        s.sendMessage(dataConfig.getNoPermission());
        return true;
    }

    private boolean suchkaOffline(CommandSender s, String arg) {
        s.sendMessage(dataConfig.getCorniferPlayerOffline().replace("$player", (arg.equals(null) ? "null suchka" : arg)));
        return true;
    }

}

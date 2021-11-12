package naulbimix.nlbCornifer.config;

import java.util.*;

import naulbimix.nlbCornifer.manager.MammonthManager;
import naulbimix.nlbCornifer.utils.*;
import org.bukkit.configuration.file.*;

public class DataConfig {

    private String noPermission, corniferUsage, corniferPlayerOffline, corniferAdded, corniferRemoved, corniferNoPlayers, cornferUsage, cornferList, permsCornifer, permsCornfer;

    public DataConfig(FileConfiguration configuration) {
        this.noPermission = ServerUtils.s(configuration.getString("messages.noPermission", "&cу вас нет прав на изнасилование"));
        this.corniferUsage = ServerUtils.s(configuration.getString("messages.cornifer.usage", "suka ebanis /cornifer <Ник не окупатора>"));
        this.corniferPlayerOffline = ServerUtils.s(configuration.getString("messages.cornifer.playerOffline", "suchka offline s nikom $player"));
        this.corniferAdded = ServerUtils.s(configuration.getString("messages.cornifer.added", "okypator s nikom $player dobavlen hui poimi kuda))))"));
        this.corniferRemoved = ServerUtils.s(configuration.getString("messages.cornifer.removed", "eblan user $player removed blinb"));
        this.corniferNoPlayers = ServerUtils.s(configuration.getString("messages.cornifer.noPlayers", "no clowns!"));
        this.cornferUsage = ServerUtils.s(configuration.getString("messages.cornfer.usage", "suka ebanis /cornfer list"));
        this.cornferList = ServerUtils.s(configuration.getString("messages.cornfer.list", "$player - sosal hui"));
        MammonthManager.addAll(new ArrayList<>(configuration.getStringList("settings.players")));
        this.permsCornifer = ServerUtils.s(configuration.getString("settings.permscornifer", "nlbcornifer.sosatb"));
        this.permsCornfer = ServerUtils.s(configuration.getString("settings.perms.cornfer", "nlbcornifer.neokyp"));
    }

    public String getNoPermission() {
        return noPermission;
    }

    public String getCorniferUsage() {
        return corniferUsage;
    }

    public String getCorniferPlayerOffline() {
        return corniferPlayerOffline;
    }

    public String getCorniferAdded() {
        return corniferAdded;
    }

    public String getCorniferRemoved() {
        return corniferRemoved;
    }

    public String getCorniferNoPlayers() {
        return corniferNoPlayers;
    }

    public String getCornferUsage() {
        return cornferUsage;
    }

    public String getCornferList() {
        return cornferList;
    }

    public String getPermsCornifer() {
        return permsCornifer;
    }

    public String getPermsCornfer() {
        return permsCornfer;
    }

}

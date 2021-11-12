package naulbimix.nlbCornifer.manager;

import java.util.*;
import org.bukkit.entity.*;

public class MammonthManager {

    private static List<String> clowns = new ArrayList<>();

    public static List<String> getClowns() {
        return clowns;
    }

    public static void addClown(String player) {
        clowns.add(player);
    }

    public static void yebatbClowna(String player) {
        clowns.remove(player);
    }

    public static void addAll(Collection<String> issue) {
        clowns.addAll(issue);
    }

    public static boolean containsClown(String player) {
        return clowns.contains(player);
    }

}

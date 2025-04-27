package service;

import java.util.HashMap;
import java.util.Map;

public class TypeEffectiveness {
    private static final Map<String, Map<String, Double>> chart = new HashMap<>();

    static {
        Map<String, Double> normal = new HashMap<>();
        normal.put("Rock", 0.5);
        normal.put("Ghost", 0.0);
        normal.put("Steel", 0.5);
        chart.put("Normal", normal);

        Map<String, Double> fire = new HashMap<>();
        fire.put("Grass", 2.0);
        fire.put("Ice", 2.0);
        fire.put("Bug", 2.0);
        fire.put("Steel", 2.0);
        fire.put("Fire", 0.5);
        fire.put("Water", 0.5);
        fire.put("Rock", 0.5);
        fire.put("Dragon", 0.5);
        chart.put("Fire", fire);

    }

    public static double getEffectiveness(String attackType, String defenseType) {
        if (defenseType == null || !chart.containsKey(attackType)) return 1.0;
        return chart.get(attackType).getOrDefault(defenseType, 1.0);
    }
}
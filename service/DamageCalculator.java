package service;

import model.Pokemon;
import model.Move;
import java.util.Random;

public class DamageCalculator {

    public static int calculateDamage(Pokemon attacker, Pokemon defender, Move move, boolean isCritical) {
        int level = attacker.getLevel();
        int A = move.isPhysical() ? attacker.getAttack() : attacker.getSpecial();
        int D = move.isPhysical() ? defender.getDefense() : defender.getSpecial();

        if (A > 255) A = A / 4;
        if (D > 255) D = D / 4;

        int critical = isCritical ? 2 : 1;

        double baseDamage = (((2 * level * critical / 5.0 + 2) * move.getPower() * A / D) / 50.0) + 2;

        double stab = (move.getType().equals(attacker.getType1()) || move.getType().equals(attacker.getType2())) ? 1.5 : 1.0;
        double typeEffectiveness = TypeEffectiveness.getEffectiveness(move.getType(), defender.getType1()) *
                                   TypeEffectiveness.getEffectiveness(move.getType(), defender.getType2());

        Random random = new Random();
        double randomFactor = (random.nextInt(39) + 217) / 255.0;

        double finalDamage = baseDamage * stab * typeEffectiveness * randomFactor;

        return (int) finalDamage;
    }
}
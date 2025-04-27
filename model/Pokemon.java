package model;

public class Pokemon {
    private String name;
    private String type1;
    private String type2;
    private int level;
    private int attack;
    private int defense;
    private int special;

    public Pokemon(String name, String type1, String type2, int level, int attack, int defense, int special) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.level = level;
        this.attack = attack;
        this.defense = defense;
        this.special = special;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public int getLevel() {
        return level;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpecial() {
        return special;
    }
}
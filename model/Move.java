package model;

public class Move {
    private String name;
    private String type;
    private int power;
    private boolean isPhysical;

    public Move(String name, String type, int power, boolean isPhysical) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.isPhysical = isPhysical;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public boolean isPhysical() {
        return isPhysical;
    }
}
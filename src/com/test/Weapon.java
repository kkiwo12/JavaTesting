package com.test;

public abstract class Weapon {
    private String name;
    private double dmg;

    public Weapon(){}

    public Weapon(String name, double dmg) {
        this.name = name;
        this.dmg = dmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    abstract void wieldWeapon();
}

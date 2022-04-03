package com.test;

public class Sword extends Weapon{
    private String name;

    public Sword(String name, double dmg) {
        super(name, dmg);
    }

    @Override
    void wieldWeapon() {
        System.out.println("The sword is being wielded");
    }
}

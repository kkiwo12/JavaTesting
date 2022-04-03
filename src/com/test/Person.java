package com.test;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private Weapon weapon;

    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //  actions

    public void talk() {
        System.out.println("This person is talking.");
    }

    public void eat() {
        System.out.println("This person is eating");
    }

    public void walk() {
        System.out.println("This person is walking");
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public static void main(String[] args) {
        Person LA = new Person("LA", "qqq", "qqqq");
        Person person2 = new Person("LA", "qqq", "qqqq");
        System.out.println(LA.getName());
        LA.setName("Lauren Andre");
        Weapon woodenSword = new Sword("Wooden Sword", 5);
        LA.equipWeapon(woodenSword);
        System.out.println(LA.getName());
        System.out.println(LA.getAddress());
        LA.getWeapon().wieldWeapon();
    }
}

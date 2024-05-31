package com.perscholas.java_basics;

public class PolymorphismAndInheritancePA {
}

class Monster{
    String name;
    Monster(String name) {
        this.name = name;
    }
    String attack(){
        return "!^_&^$@+%$* I don't know how to attack!";
    }
}

class FireMonster extends Monster{
    FireMonster(String name){
        super(name);
    }
    String attack(){
        return "Attack with fire!";
    }
}

class WaterMonster extends FireMonster{
    WaterMonster(String name){
        super(name);
    }
    String attack(){
        return "Attack with water!";
    }
}

class StoneMonster extends FireMonster{
    StoneMonster(String name){
        super(name);
    }
    String attack(){
        return "Attack with stone!";
    }
}

class TestMonster {
    public static void main(String[] args) {
        // Program at the "interface" defined in the superclass.
        // Declare instances of the superclass, substituted by subclasses.
        Monster m1 = new FireMonster("r2u2"); // upcast
        Monster m2 = new WaterMonster("u2r2"); // upcast
        Monster m3 = new StoneMonster("r2r2"); // upcast
        // Invoke the actual implementation
        System.out.println(m1.attack()); // Run FireMonster's attack()
        System.out.println(m2.attack()); // Run WaterMonster's attack()
        System.out.println(m3.attack()); // Run StoneMonster's attack()
        // m1 dies, generates a new instance and re-assign to m1.
        m1 = new StoneMonster("a2b2"); // upcast
        System.out.println(m1.attack()); // Run StoneMonster's attack()
        // We have a problem here!!!
        Monster m4 = new Monster("u2u2");
        System.out.println(m4.attack()); // garbage!!!
    }
}
package com.company;

public class Warrior extends Player {
    public Warrior(String name,int age,String klass,String history) {
        super(name, age, klass, history);
    }

    public void typeAttack(){
        System.out.println("Dragon Knight — это герой с ближним типом атаки, основным атрибутом которого является Strength  сила.");

    }

}

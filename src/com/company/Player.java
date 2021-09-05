package com.company;

public class Player {

    public void typeAttack(){
        System.out.println("Тип атаки");
    }


    private String name;
    private int age;
    private String klass;
    private String history;

    public Player(String name, int age, String klass, String history) {
        this.name = name;
        this.age = age;
        this.klass = klass;
        this.history = history;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}

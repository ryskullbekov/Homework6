package com.company;

public class Main {

    public static void main(String[] args) {
	// Домашняя работа №6

        Boss boss = new Boss("TerrorBlade",1000,"Demon","Этот демон-мародёр обрёл славу закоренелого преступника даже среди других адских тварей.");
        System.out.println("Имя ему :" + " " + boss.getName() + " " + boss.getAge() + " " + "лет " + boss.getKlass() + " " + "rласс" + " " + boss.getHistory() );
        boss.typeAttack();

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Warrior warrior = new Warrior("Devion", 25,"Dragon knight","Кровь Слайрака течёт в жилах Dragon Knight, а его способность перевоплощаться в дракона уже стала легендарной.");
        System.out.println("Имя ему :" + " " + warrior.getName() + " " + warrior.getAge() + " " + "лет " + warrior.getKlass() + " " + "rласс" + " " + warrior.getHistory());
        warrior.typeAttack();

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Magical magical = new Magical("Mirana",23,"Princess of the moon","Наследница королевской династии и первая претендентка на Лучезарный трон отреклась от мирских земель и титулов, посвятив свою жизнь богине Луны Селемине. ");
        System.out.println("Имя ему :" + " " + magical.getName() + " " + magical.getAge() + " " + "лет " + magical.getKlass() + " " + "rласс" + " " + magical.getHistory());
        warrior.typeAttack();

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Mental mental = new Mental("Rubick",20,"Great telepath","Любому колдуну под силу использовать заклинание или два, а некоторые из них могут даже обучаться достаточно долго, чтобы стать волшебником, но лишь самым талантливым дозволено носить титул мага.");
        System.out.println("Имя ему :" + " " + mental.getName() + " " + mental.getAge() + " " + "лет " + mental.getKlass() + " " + "rласс" + " " + mental.getHistory());
        mental.typeAttack();

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Agility agility = new Agility("Ostarion",1240,"Tank","Бессчётные годы Остарион строил королевство на останках своих врагов.");
        System.out.println("Имя ему :" + " " + agility.getName() + " " + agility.getAge() + " " + "лет " + agility.getKlass() + " " + "rласс" + " " + agility.getHistory());
        agility.typeAttack();
    }

}

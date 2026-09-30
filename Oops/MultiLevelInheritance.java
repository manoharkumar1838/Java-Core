package Oops;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog leo = new Dog();
        leo.Color = "White";
        leo.leg = 4;
        leo.breed = "Street Dog";
        System.out.println(leo.Color);
        System.out.println("Leao has " +leo.leg+ " legs");
        System.out.println(leo.breed);
        leo.eat();
        leo.breathe();
    }
}

class Animal {
    String Color;

    void eat() {
        System.out.println("Eating");
    }

    void breathe() {
        System.out.println("Breathing");
    }
}

class Mammals extends Animal {
    int leg;
}

class Dog extends Mammals {
    String breed;
}

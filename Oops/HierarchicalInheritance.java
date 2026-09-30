package Oops;

// 3rd type of Inheritance
public class HierarchicalInheritance {
    public static void main(String[] args) {
    Fish shark = new Fish();
    shark.color = "Black";
    System.out.println(shark.color);
    shark.breathe();
    shark.eat();
    shark.Swim();

    Bird owl = new Bird();
    owl.color = "Grey";
    System.out.println(owl.color);
    owl.breathe();
    owl.eat();
    owl.Fly();
    
    Mammal m1 = new Mammal();
    m1.color = "Brown";
    System.out.println(m1.color);
    m1.eat();
    m1.breathe();
    m1.Walk();


    }
    
}

class Animal {
    String color;

    void breathe() {
        System.out.println("Breathing");
    }

    void eat() {
        System.out.println("Eating");
    }
}

class Fish extends Animal {
    int gills;

    void Swim() {
        System.out.println("Fish can Swimming00");
    }
}

class Bird extends Animal {
    int wings;

    void Fly() {
        System.out.println("Bird can fly");
    }

}

class Mammal extends Animal {
    void Walk() {
        System.out.println("Walking");
    }
}

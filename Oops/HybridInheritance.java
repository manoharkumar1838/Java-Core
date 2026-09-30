package Oops;

public class HybridInheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.color = "Silver";
        f1.eat();
        f1.breathe();
        f1.swim();
        
     Human h1 = new Human();
     h1.eat();
     h1.breathe();
     h1.Singing();
   }
    

}

class Animal {
    String color;

    void eat() {
        System.out.println("Eating");
    }

    void breathe() {
        System.out.println("Breathing");
    }
}

class Fish extends Animal {
    int gills;
    String Size;

    void swim() {
        System.out.println("Can Swim");
    }
}

class Tuna extends Fish {
    
}

class shark extends Fish {
    
}

class Bird extends Animal {
    void fly() {
        System.out.println("Can fly");
    }
}

class Parrot extends Bird {
    void talk() {
        System.out.println("Can talking");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Can walk");
    }
}

class Dog extends Mammal {
    String Breed;

    void Bark() {
        System.out.println("Barking");
    }
}

class Cat extends Mammal {
    void tail() {
        System.out.println("Have tail");
    }
}

class Human extends Mammal {
    void Singing() {
        System.out.println("Human can sing a song");
    }
}

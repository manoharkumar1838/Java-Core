package Oops;

public class Abstraction {
    public static void main(String[] args) {
        /* 
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
        
        */
      
        Mustang myHorse = new Mustang();

        // Can not create animal object
       // Animal a1 = new Animal();
    }
}

abstract class Animal {
    String color;

    Animal() {
       System.out.println("Animal constructor called");
    }

    // Normal Or non-abstrsct method
    // Implementaion
    void eat() {
        System.out.println("Can eat");
    }

    // Abstract method
     // No body or implementation
    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constractor called");
    }

    void changeColor() {
        color = "Dark brown";
    }

    void walk() {
        System.out.println("Horse have 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustung Constuctor is called");
    }
}

class Chicken extends Animal {

    Chicken() {
        System.out.println("Chicken constructor called");
    }
    
    void changeColor() {
        color = "White";
    }
    void walk() {
        System.out.println("chicken have 2 legs");
    }
}


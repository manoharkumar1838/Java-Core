package Oops;

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal a1 = new Deer();
        Animal a2 = new Dog();
        a1.eat();
        a2.eat();

    }

    // Runtime polymorphism
    /*
    Method Overriding :- Parent and chils class both contain the same function with a different definition.
    It is a type of Runtime polymorphism.
    */

}

class Animal {
    void eat() {
        System.out.println("can eat anything");
    }
}

class Deer extends Animal {

    void eat() {
        System.out.println("only eat grass");
    }
}

class Dog extends Animal {
    
    void eat() {
        System.out.println("eat chicken");
    }
 }

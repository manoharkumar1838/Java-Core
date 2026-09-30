package Oops;

public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.Color = "Black";
        System.out.println(d1.Color);
        d1.eat();
        d1.breathe();
        d1.bark();
    }

}
// Single level inheritance

// Parent class OR Super class OR Base class
class Animal {
    String Color;

    void eat() {
        System.out.println("Animal is Eat");
    }

    void breathe() {
        System.out.println("Animal is breathing");
    }
}

// Child class OR Derived
class Dog extends Animal{
   void bark(){
     System.out.println("Dog is barking");
    }
}

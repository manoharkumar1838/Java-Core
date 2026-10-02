package Oops;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(3, 5));
        System.out.println(c.sum((float)4.5, (float)8.6));
        System.out.println(c.sum(4,5,6));
    }
}

// Compile time polymorphism
/* 
Mehtod Overloading :- Same function with differet parameter with type or count.
-> It is a type of compile time polymorphism
*/

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }
     
    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
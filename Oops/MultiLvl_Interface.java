package Oops;

// Java does not support Multiple Inheritance using classes 
public class MultiLvl_Interface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eatGrass();
        d.eatMeat();

    }
}
// Multiple Inheritance using interface
interface Herbivore {
    void eatGrass();
}

interface Carnivore {
    void eatMeat();
}

class Dog implements Herbivore, Carnivore {
    public void eatGrass() {
        System.out.println("Dog can eat veg");
    }

    public void eatMeat() {
        System.out.println("Dog can eat Meat");
     }
}

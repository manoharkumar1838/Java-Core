package Oops;

public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen object called p1 in Heap memory

        // String newColor = "Blue";
        p1.setColor("Blue");
        System.out.println(p1.color);
        
        p1.setTip(5);
        System.out.println(p1.tip);

        // p1.setColor("yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);

        Student s1 = new Student();

        String newName = "Manohar";
        s1.setName(newName);
        System.out.println(s1.name);

    }

}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    int rollno;

    void setName(String newName) {
        name = newName;
    }

    void setAge(int newAge) {
        age = newAge;
    }
}

package Oops;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Manohar", 22);
        Student s3 = new Student(20);

        System.out.println(s1.name+ " " +s1.age);
        System.out.println(s2.name+ " " +s2.age);
        System.out.println(s3.age);
       
    }
}

class Student {
    String name;
    int age;

    // Non parameter
     Student() {
        name = "manohar";
        age = 21;
    } 

    // with parameter
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        //  name = "Manohar";
    }

     Student(int age){
            this.age = age;
        }
        /*
        Constructor overloading :-
        Having more then one constructor in a same class but with different parameter.
        */
    
}

package Oops;

public class AccessModifiers {

    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        // myAcc.Username = "Manohar";
        String name = "Manohar";
        myAcc.setUsername(name);
        System.out.println(myAcc.Username);

        // can not access password in private outside class
        // myAcc.password = "Manohar@123";

        // Only can set password in private
        myAcc.setPassword("Manohar@123");

    }

}

// ACCESS MODIFIERS
/*
(1) Private - Can access only wothin class.
(2) Default - Can access inside class and within package.
(3) Protected - Can access inside class, package, and outside package by subclass only.
(4) Public - Can access every where.
 */

class BankAccount {
   public String Username;
   private String password;

   void setUsername(String name) {
       Username = name;
   }

   void setPassword(String pwd) {
       password = pwd;
   }
}

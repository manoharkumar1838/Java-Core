package String;

import java.util.*;

public class Strings {
    public static void printLettera(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
         System.out.println();
    }
    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "Manohar123";
        // String str2 = new String("manohar");
        // // Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // System.out.println(name);

        // Length function
        // String fullName = "Manohar Kumar";
        // System.out.println(fullName.length());

        // concatination
        String firstName = "Manohar";
        String LastName = "Kumar";
        String FullName = firstName + " " +LastName;
        // System.out.println(FullName);
        // System.out.println(FullName.charAt(6)); // used to find specific character
       printLettera(FullName);
    }
    
}

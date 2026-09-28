package String;

public class stringFunction {
    public static void main(String[] args) {
        String s1 = "Manohar";
        String s2 = "Manohar";
        String s3 = new String("Manohar");

        if (s1 == s2) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        // if (s2 == s3) {
        //      System.out.println("String are equal");
        //  } else {
        //      System.out.println("String are not equal");
        //  }
        
          if (s2.equals(s3)) {
             System.out.println("String are equal");
         } else {
             System.out.println("String are not equal");
        }
    }
}
 
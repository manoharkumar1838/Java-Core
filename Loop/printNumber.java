package Loop;

import java.util.*;

public class printNumber {
    
    public static void main(String[] args) {
//  print number from 1 to n

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}

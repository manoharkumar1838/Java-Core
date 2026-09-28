package Loop;

import java.util.*;

public class printFirstNatural {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // int i = 1;
        // while (i <= n) {
        //     sum = sum + i;
        //     i++;
        // }
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum is : " + sum);
    }
    
}

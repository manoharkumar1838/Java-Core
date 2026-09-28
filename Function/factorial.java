package Function;

import java.util.Scanner;

public class factorial {
    // Factorial code
    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;

    }
    
    // Binmial Coefficient code
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        
        int binCoeff = fact_n / (fact_r * fact_nmr);
        
        return binCoeff;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int n = 5;
        // int fact = factorial(n);
       System.out.println(binCoeff(5, 2));
    }
}

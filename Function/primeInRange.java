package Function;

public class primeInRange {

    // public static boolean primeOrNot(int n) {
    //     boolean isPrime = true;
    //     if (n < 2) {
    //         isPrime = false;
    //     } else {
    //         for (int i = 2; i <= Math.sqrt(n); i++) {
    //             if (n % i == 0) {
    //                 isPrime = false;
    //                 break;
    //             }
    //         }
    //     }
    //     return isPrime;
        
    // }
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (primeOrNot.isPrime(i)) { // here primeOrNot is classname and isPrime is method name whic is used from primeOrNOt code file
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        primeInRange(14);
    }
}

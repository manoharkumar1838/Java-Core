package Function;

public class primeOrNot {

    public static boolean isPrime(int n) {
       boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        } else {
             
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        }
       
        return isPrime;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPrime(n));
    }
}

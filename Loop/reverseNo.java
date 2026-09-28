package Loop;

public class reverseNo {
    public static void main(String[] args) {
// print reverse of a number


        // int n = 10899;
        // while (n > 0) {
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n = n / 10;
        // }
        
        int n = 9876543;
        for (; n > 0; n = n / 10) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
        }
    
    }
}

public class bitwiseOddEven {
    public static void oddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number");
        } 
        else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddEven(5);
        oddEven(2);
        oddEven(9);
        oddEven(6);
    }
    
}

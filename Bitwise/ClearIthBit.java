package Bitwise;

public class ClearIthBit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        System.out.println(clearIthBit(n, i));
    }
    
}

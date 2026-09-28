package Function;

public class decToBin {
    public static void decToBin(int num) {
        
        int pow = 0;
        int bin = 0;

        while (num > 0) {
            int rem = num % 2;
            bin = bin + (rem * ((int) Math.pow(10, pow)));
            pow++;
            num = num / 2;
        }
        System.out.println(bin);
        
    }
    public static void main(String[] args) {
        decToBin(5);
    }
}

package Function;

public class binaryToDec {
    public static void binToDec(int binNum) {
        int power = 0;
        int decimal = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decimal = (decimal + (lastDigit *(int)(Math.pow(2, power))));
            power++;
            binNum = binNum / 10;
        }
        System.out.println(decimal);
        
    }

    public static void main(String[] args) {
        binToDec(100);
        
    }
}

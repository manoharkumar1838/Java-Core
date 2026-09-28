package Arrays;

public class pairsInArray {
    public static void printPairs(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            System.out.print(curr + ": ");
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        printPairs(num);
    }
}

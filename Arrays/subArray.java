package Arrays;

public class subArray {
    public static void printSubArray(int num[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        // totao subArray
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                int sum = 0;
                // System.out.print("(" + num[i] + "," + num[j] + ")");
                for (int k = start; k <= end; k++) {
                    sum = sum + num[k];
                    System.out.print(num[k] + " ");
                }
                ts++;
                System.out.println("= Sum: " + sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
            }
            System.out.println();
        }
         System.out.println("Total SubArray is : " +ts);
        System.out.println("Max Sum =" + maxSum);
         System.out.println("Min Sum = " + minSum);
    }
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        printSubArray(num);

    }
}

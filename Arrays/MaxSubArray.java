package Arrays;

public class MaxSubArray {
    public static void MaxSubArray(int num[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + num[k];

                }
                 System.out.println("sum is " + sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum is = " +maxSum);
    }
    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        MaxSubArray(num);
    }
}

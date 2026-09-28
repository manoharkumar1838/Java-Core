public class invertedStar {
    public static void main(String[] args) {
        // (n-i+1)
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i+1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

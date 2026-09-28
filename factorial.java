public class factorial {
    public static void main(String[] args) {
        // int n = 7;
        int fact = 1;
        for (int i = 7; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

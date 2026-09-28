package Function;

public class findProduct {
    public static int multiply(int a, int b){
        int product = a*b;
        return product;

    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int prod = multiply(a, b);
        System.out.println("a * b = : " + prod);
      int prod2 = multiply(10,30);
      System.out.println("a * b = : " +prod2);

    }
}

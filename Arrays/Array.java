package Arrays;

public class Array {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        // int marks[] = new int[50];
        int marks[] = { 80, 70, 96 };
        update(marks);
        
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
    }
}

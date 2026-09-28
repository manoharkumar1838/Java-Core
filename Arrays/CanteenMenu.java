package Arrays;

public class CanteenMenu {
    public static int canteenMenu(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] = { "dosa", "samosa", "chai", "sprite", "IceCreame" };
        String key = "chai";

        int index = canteenMenu(menu, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Chai found at :" + index);
        }
    }
}

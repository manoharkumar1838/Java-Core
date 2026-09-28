package String;

public class subString {
    public static String subString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr = subStr + str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        // int si = 0; // starting index
        // int ei = 4; // ending index

        String s1 = str.substring(0,5);
      System.out.println(s1);

       // System.out.println(subString(str, 0, 5));
    }
} 

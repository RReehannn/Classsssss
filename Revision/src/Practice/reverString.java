package Practice;

public class reverString {
    public static void main(String[] args) {

        String str = "I Love India";

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(reversed);
    }
}

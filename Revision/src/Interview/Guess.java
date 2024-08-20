package Interview;

public class Guess {
    public static void main(String[] args) {

        int a = 3;
        int b = 4;

        int c = ++a * b--;

        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }
}

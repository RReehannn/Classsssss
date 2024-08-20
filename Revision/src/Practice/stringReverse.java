package Practice;

public class stringReverse {
    public static void main(String[] args) {

        String s = "Virat Kohli";

        int length = s.length();


        String reverse = "";

        for (int i = length - 1; i >= 0; i --){

            reverse = reverse + s.charAt(i);

        }
        System.out.println(reverse);
        stringReverse();
    }

    public static void stringReverse(){

        String name = "Virat Kohli";

        StringBuilder sb = new StringBuilder(name);

        System.out.println(sb.reverse());

        System.out.println(sb.reverse().toString());


    }
}

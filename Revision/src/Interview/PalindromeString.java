package Interview;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Please Enter the String: ");
        String s = read.nextLine();

        String rev = "";

        for (int i = s.length() -1; i >=0 ; i--) {

            rev = rev + s.charAt(i);

        }
        if (s.equalsIgnoreCase(rev)){
            System.out.println(s + " is Palindrome");
        } else {
            System.out.println(s + " is Not Palindrome");
            read.close();
        }
    }
}

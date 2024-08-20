package MainQuestion;

import java.util.Scanner;
class CharacterCount {
    public static void main(String[] args) {

        System.out.println("Welcome in String Count");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string:");
        String inputString = scanner.nextLine();


        int characterCount = inputString.length();


        System.out.println("The number of characters in the string is: " + characterCount);



    }
}


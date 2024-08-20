package MainQuestion;

import java.util.Scanner;
//A palindromic number is a number (such as, 121, 212, 343, 16461) that remains the same when its digits are reversed
//Check if a given input, is a palindrome.

class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Palindrome the Digits");
        System.out.println("Please Enter the number: ");
        int number = input.nextInt();
        boolean isPPalindrome = isPalindrome(number);

        if (isPPalindrome){
            System.out.println("Your Number is palindromic Number");
        } else {
            System.out.println("Your Number is not palindromic Number");
        }

    }

    public static boolean isPalindrome(int num){
        return num == reverse(num);
    }

    public static int reverse(int num){
        int newNum = 0;
        while (num>0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num/ 10;
        }
        return newNum;
    }

}

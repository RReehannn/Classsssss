package Practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number: ");

        int number = scanner.nextInt();

        boolean palin = isPalindrome(number);


            if (palin){
                System.out.println("yes");
            } else {
                System.out.println("not palin");
            }
        }

    public static boolean isPalindrome(int num){
        return num == reverse(num);
    }

    public static long reverse(int num1){

        int newNum = 0;

        while (num1 > 0){
            int Digit = num1 %10;
            newNum = newNum * 10 + Digit;
            num1 =  num1 / 10;
        }
        return newNum;
    }
}

package MainQuestion;

import java.util.Scanner;

class isPrimeNUmber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Prime Number");

        System.out.print("Please Enter the Number:- ");
        int number = input.nextInt();
        boolean isPrime = isPrime(number);

        if (isPrime){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }


    }
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }

        int i = 2;
        while (i < num){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}

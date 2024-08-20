package Practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Welcome to Prime Number Checker");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        boolean isPrime = isPrime(number);

        if (isPrime){
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

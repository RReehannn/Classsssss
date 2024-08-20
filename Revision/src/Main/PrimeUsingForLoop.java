package Main;

import java.util.Scanner;

class PrimeUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number checker");
        System.out.println("please Enter the number:-");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println("Your number is " +
                (isPrime(num) ? "Prime" : "Not Prime"));
    }
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
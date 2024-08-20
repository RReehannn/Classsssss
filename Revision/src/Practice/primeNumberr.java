package Practice;

import java.util.Scanner;

public class primeNumberr {
    public static void main(String[] args) {

        System.out.println("Welcome in coding of Prime Number");
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the NUmber: ");
        int number = input.nextInt();

        boolean isPrimee = isPrime(number);

        if (isPrimee){
            System.out.println("Prime Number hai");
        } else {
            System.out.println("Nahi hai prime");
        }


    }

    public static boolean isPrime(int num){

        if (num <= 1){
            return false;

        } int i = 2;
        while (i < num){
            if (num % i ==0){
                return false;
            }
            i++;

        }return true;


    }
}

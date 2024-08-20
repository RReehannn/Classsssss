package Practice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Going to find factorial using recursion");
        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        long fact = recursion(number);

        System.out.println(fact);


    }

    public static long recursion(int num){

        if (num <= 1){
            return 1;
        }
        return num*recursion(num-1);
    }
}

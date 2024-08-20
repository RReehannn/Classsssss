package MainQuestion;// Find factorial of a number with recursion.


import java.util.Scanner;

class factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the recursive method to calculate factorial
        long factorial = calculateFactorial(number);

        // Output the result
        System.out.println("The factorial of " + number + " is " + factorial);
    }

    public static long calculateFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n <= 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * calculateFactorial(n - 1);
    }
}


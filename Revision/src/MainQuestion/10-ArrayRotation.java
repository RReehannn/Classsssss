package MainQuestion;

import java.util.Scanner;

class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array size
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        // Input the array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the number of positions to rotate
        System.out.println("Enter the number of positions to rotate:");
        int positions = scanner.nextInt();

        // Input the direction of rotation
        System.out.println("Enter the direction of rotation (clockwise/anticlockwise):");
        String direction = scanner.next();

        // Perform the rotation
        if (direction.equalsIgnoreCase("clockwise")) {
            rotateClockwise(array, positions);
        } else if (direction.equalsIgnoreCase("anticlockwise")) {
            rotateAnticlockwise(array, positions);
        } else {
            System.out.println("Invalid direction!");
            return;
        }

        // Print the rotated array
        System.out.println("The rotated array is:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static void rotateClockwise(int[] array, int positions) {
        int length = array.length;
        positions = positions % length;

        reverse(array, 0, length - 1);
        reverse(array, 0, positions - 1);
        reverse(array, positions, length - 1);
    }

    public static void rotateAnticlockwise(int[] array, int positions) {
        int length = array.length;
        positions = positions % length;

        reverse(array, 0, positions - 1);
        reverse(array, positions, length - 1);
        reverse(array, 0, length - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}


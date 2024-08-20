package Practice;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 8};

        System.out.print("Original array: ");
        printArray(array);

        reverseArray(array);

        System.out.print("\nReversed array: ");
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}


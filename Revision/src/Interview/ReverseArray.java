package Interview;

public class ReverseArray {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4, 8};

        // Print original array
//        System.out.print("Original array: ");
//        for (int num : i) {
//            System.out.print(num + " ");
//        }

        // Reverse the array
        reverseArray(i);

        // Print reversed array
        System.out.print("\nReversed array: ");
        for (int num : i) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap the elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the pointers towards the middle
            start++;
            end--;
        }
    }
}


package MainQuestion;

import java.util.Arrays;
import java.util.Scanner;

class anagramKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter second string:");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        scanner.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        // If both strings are null or empty, they are anagrams
        if ((str1 == null && str2 == null) || (str1.isEmpty() && str2.isEmpty())) {
            return true;
        }

        // If one string is null or empty and the other is not, they are not anagrams
        if ((str1 == null || str2 == null) || (str1.isEmpty() || str2.isEmpty())) {
        return false;
    }

    // Convert both strings to lowercase and sort them
    char[] str1Array = str1.toLowerCase().toCharArray();
    char[] str2Array = str2.toLowerCase().toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

    // Compare the sorted arrays
        return Arrays.equals(str1Array, str2Array);
}
}



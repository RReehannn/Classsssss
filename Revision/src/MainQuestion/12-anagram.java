package MainQuestion;

import java.util.Arrays;

class anagram {
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent")); // true
        System.out.println(areAnagrams("hello", "world")); // false
    }

    public static boolean areAnagrams(String str1, String str2) {
        // If both strings are null or empty, they are anagrams
        if (str1 == null && str2 == null || str1.isEmpty() && str2.isEmpty()) {
            return true;
        }

        // If one string is null or empty and the other is not, they are not anagrams
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
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


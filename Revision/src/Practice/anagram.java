package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter the first String: ");
        String str1 = scanner.nextLine();

        System.out.print("Please Enter the second String: ");
        String str2 = scanner.nextLine();

        if (areAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagram(String str1, String str2){

        if (str1==null && str2 == null || str1.isEmpty() && str2.isEmpty()){
            return true;
        }

        if (str1==null || str2 == null || str1.isEmpty() || str2.isEmpty()){
            return false;
        }

        char[] str1Array = str1.toLowerCase().toCharArray();
        char[] str2Array = str2.toLowerCase().toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array, str2Array);
    }
}

package NewInterview;

import java.util.HashMap;
import java.util.Map;

public class LetterFrequency {
    public static void main(String[] args) {
        String sentence = "I live in India. India is my country. India population is in millions.";
        Map<Character, Integer> letterCountMap = countLetterFrequency(sentence);
        
        // Print the letter frequencies
        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countLetterFrequency(String sentence) {
        // Use a HashMap to store the frequency of each letter
        Map<Character, Integer> letterCountMap = new HashMap<>();
        for (char letter : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(letter)) {
                letterCountMap.put(letter, letterCountMap.getOrDefault(letter, 0) + 1);
            }
        }
        
        return letterCountMap;
    }
}


/*

Converting to Lowercase:

The sentence.toLowerCase() method converts the entire sentence to lowercase to ensure case insensitivity.
Iterating Over Characters:

The sentence.toCharArray() method converts the sentence into an array of characters.
The program iterates over each character and checks if it is a letter using Character.isLetter(letter).
Counting Letter Frequency:

A HashMap is used to store the frequency of each letter. The key is the letter, and the value is the count of occurrences.
The letterCountMap.put(letter, letterCountMap.getOrDefault(letter, 0) + 1) line updates the count for each letter. If the letter is not already in the map, getOrDefault(letter, 0) returns 0.
Printing the Frequencies:

The program iterates over the entries of the letterCountMap and prints each letter with its count.
*
*
* */

package NewInterview;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "I live is in India. India is my country. India population is in millions.";
        Map<String, Integer> wordCountMap = countWordFrequency(sentence);
        
        // Print the word frequencies
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWordFrequency(String sentence) {
        // Split the sentence into words using spaces and punctuation as delimiters
        String[] words = sentence.split("\\W+");
        
        // Use a HashMap to store the frequency of each word
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase(); // Converting to lower case to avoid case sensitivity
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        return wordCountMap;
    }
}

/*

Splitting the Sentence:

The sentence.split("\\W+") method splits the sentence into words based on non-word characters (\\W+), which include spaces and punctuation.
Counting Word Frequency:

A HashMap is used to store the frequency of each word. The key is the word, and the value is the count of occurrences.
The word.toLowerCase() method converts words to lowercase to ensure that "India" and "india" are treated as the same word.
The wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1) line updates the count for each word. If the word is not already in the map, getOrDefault(word, 0) returns 0.
Printing the Frequencies:

The program iterates over the entries of the wordCountMap and prints each word with its count.
*
* */

package NewInterview;

import java.util.LinkedHashSet;

public class UniqueWords {
    public static void main(String[] args) {
        String sentence = "I live Live in India. India is my country. India population is in millions country.";
        System.out.println("Current String: " + sentence);

        String uniqueWordsSentence = filterUniqueWords(sentence);
        System.out.println("\nNew String : " + uniqueWordsSentence);
    }

    public static String filterUniqueWords(String sentence) {
        // Split the sentence into words using spaces and punctuation as delimiters
        String[] words = sentence.split("\\W+");

        // Use LinkedHashSet to preserve the order and remove duplicates
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase()); // Converting to lower case to avoid case sensitivity
        }

        // Join the unique words back into a single string
        return String.join(" ", uniqueWords);
    }
}


/*
Splitting the Sentence:

The sentence.split("\\W+") method splits the sentence into words based on non-word characters (\\W+), which include spaces and punctuation.
Removing Duplicates:

The LinkedHashSet is used to store words. It preserves the order of insertion and automatically removes duplicates.
Case Sensitivity:

Words are converted to lowercase using word.toLowerCase() to ensure that "India" and "india" are treated as the same word.
Joining Words:

The String.join(" ", uniqueWords) method joins the unique words back into a single string, separated by spaces.
*
*
* */

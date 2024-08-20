package NewInterview;

import java.util.Arrays;

public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "Hello, world! This_is a test-string: let's split it correctly.";

        // Split the sentence using non-word characters
        String[] wordsNonWord = sentence.split("\\W+");
        System.out.println("Using \\W+: " + Arrays.toString(wordsNonWord));

        // Split the sentence using spaces only
        String[] wordsSpaces = sentence.split("\\s+");
        System.out.println("\nUsing \\s+: " + Arrays.toString(wordsSpaces));

        // Split the sentence using punctuation only
        String[] wordsPunctuation = sentence.split("[,.!?;:]+");
        System.out.println("\nUsing punctuation: " + Arrays.toString(wordsPunctuation));

        // Split the sentence using a combination of delimiters
        String[] wordsCustom = sentence.split("[,;:.\\s]+");
        System.out.println("\nUsing custom delimiters: " + Arrays.toString(wordsCustom));

        // Split the sentence using non-word characters and underscores
        String[] wordsNonWordUnderscore = sentence.split("[\\W_]+");
        System.out.println("\nUsing \\W_+: " + Arrays.toString(wordsNonWordUnderscore));
    }
}

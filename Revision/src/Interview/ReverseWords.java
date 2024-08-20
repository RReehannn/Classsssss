package Interview;

public class ReverseWords {

    public static void main(String[] args) {
        String sentence = "I love india";
        String reversedSentence = reverseWordsInString(sentence);
        System.out.println(reversedSentence);
    }

    // Method to reverse words in a sentence
    public static String reverseWordsInString(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        // Reverse each word and append to the result
        for (String word : words) {
        //    result.append(word).String(words).append(" ");
        }

        // Return the final string, trimmed to remove the trailing space
        return result.toString().trim();
    }

    // Method to reverse a given string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}

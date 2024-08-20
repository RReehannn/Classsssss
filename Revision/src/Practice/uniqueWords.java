package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class uniqueWords {
    public static void main(String[] args) {

        String sentence = "I Love My India. India Love Me. India Love Is Love And India Life Is Life";
        System.out.println(sentence);

//        String result = filterUniqueWords(sentence);
//        System.out.println(result);

        String uniqueWordsSentence = filterUniqueWords(sentence);
        System.out.println("\nNew String : " + uniqueWordsSentence);



    }

    public static String filterUniqueWords(String sentence){

        String[] words = sentence.split("\\W+");

        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();
        for (String word: words){

            uniqueWords.add(word.toLowerCase());

        }

        return String.join(" ", uniqueWords);

    }
}


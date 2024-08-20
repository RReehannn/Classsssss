package Main;

import java.util.HashSet;
import java.util.Set;

public class main1 {
    public static void main(String[] args) {

        int[] numbers = {10, 11, 11, 11, 13, 13, 13, 15, 15, 15};

        Set set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {

            set.add(numbers[i]);

        }

        System.out.println(set);


    }

}

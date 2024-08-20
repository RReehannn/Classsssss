package Interview;

import java.util.*;

public class collectionn {
    public static void main(String[] args) {


        List<String> l = Arrays.asList("Faheem","Faheem","Rehan","Java","Java");


        Set<String> newL = new TreeSet<>();

        newL.addAll(l);

        System.out.println(newL);



    }
}

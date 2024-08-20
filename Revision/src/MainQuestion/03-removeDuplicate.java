package MainQuestion;//WAP to remove duplicate elements in an ArrayList using hashmap.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class RemoveDuplicate {
    public static void main(String[] args) {
        int[] a = {5,13,13, 13, 4,5,5,4,5,7,6,9};


        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);

        }

        System.out.println(set);

/*
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);

        }*/
//        Integer[] b = set.toArray(new Integer[set.size()]);
//        System.out.println(Arrays.toString(b));

        // Output: [3, 4, 5, 6, 7, 9]
    }
}

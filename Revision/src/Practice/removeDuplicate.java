package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args) {

        int[] a = {11, 11, 12, 15, 7, 7, 7};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);

        }

        Integer[] b = set.toArray(new Integer[set.size()]);

        System.out.println(Arrays.toString(b));

        newWay();

    }


    public static void newWay(){

        int[] x = {1,2,2,2,6,6,6,6,7,7};

        Integer[] b = Arrays.stream(x).distinct().boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(b));

        // Arrays.stream(x) - creates a intStream from the array x
        // distinct() - remove duplicate
        // boxed() - converts the Int-stream to a stream Integer
        // toArray(Integer[]::new collect the stream into new array


    }
}

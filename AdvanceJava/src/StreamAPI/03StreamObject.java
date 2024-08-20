package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StreamObject {
    public static void main(String[] args) {

        //1st way
        Stream<Object> emptyStream = Stream.empty();

      //2nd way
       String names[] = {"Lalu", "Rabrai", "Misha", "Tejsapi"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });

        //3
        Stream<Object> objectStream = Stream.builder().build();
        System.out.println(objectStream);

        //4
        IntStream stream = Arrays.stream(new int[]{2, 4, 65, 3, 564});
        stream.forEach(e -> {
            System.out.print(e + " ");
        });

        //5, List, set

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        Stream<Integer> stream2 = list2.stream();

        stream2.forEach(e ->{

            System.out.print(e + " ");
        });
    }
}

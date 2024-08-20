package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamMain1 {
    public static void main(String[] args) {

        //Create a list and Filter all the even numbers from list
        List<Integer> list1 = List.of(2, 4, 50, 21, 33, 22, 55, 66,555,666);


        //List1
        // Without stream
        List<Integer> listEven = new ArrayList<>();

        for (Integer i:list1){
            if (i%2==0){
                listEven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(listEven);

        System.out.println("----------------");


        //using stream API
        //Stream is interface

        Stream<Integer> stream = list1.stream();

        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> collected = list1.stream().filter(i -> i > 100).collect(Collectors.toList());
        System.out.println(collected);
    }
}

package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

class Methods {
    public static void main(String[] args) {

        //filter (Predicate)
            // boolean value Function
        // e -> { }



        //map(Function)
        /*
        *  each element operation
        *
        * */

        List<String> names = List.of("Rehan","Amana", "Faizan", "Ankit", "Abhinav", "Durgesh");
        List<String> newName = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newName);

        //
        List<Integer> numbers = List.of(23,4,2,5,4,7);
        List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newNumbers);


        //sorted

        numbers.stream().forEach(System.out::println);

        Integer i = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min " + i);


    }
}

package Predicate_String;


import java.util.*;
import java.util.function.Predicate;

 class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 5, 30);

        Predicate<Integer> greaterThan15 = n -> n > 15;

        list.stream()
                .filter(greaterThan15)
                .forEach(System.out::println);

    }
}





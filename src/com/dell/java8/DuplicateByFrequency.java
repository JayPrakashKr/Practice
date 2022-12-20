package com.dell.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateByFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

        List<Integer> collect1 = list.stream().filter(a -> Collections.frequency(list, a) > 1).collect(Collectors.toList());
        System.out.println(collect1);
        final Set<Integer> collect = list.stream()
                .collect(
                        Collectors
                                .groupingBy(
                                        Function.identity(),
                                        Collectors.counting()
                                )
                )
                .entrySet()
                .stream()
                .filter(a -> a.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(collect);
    }
}

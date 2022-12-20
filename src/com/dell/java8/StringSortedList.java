package com.dell.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringSortedList {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("jay","prakash","kumar","dipu","kumar","sippu","pappu");
        Map<String, Long> collect = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        // final Map<String, Long> collect = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       // System.out.println(collect);
    }

}

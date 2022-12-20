package com.dell.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10,15,8,49,25,98,32);
        integers.stream().filter(a -> a % 2 == 0).forEachOrdered(System.out::println);

    }
}

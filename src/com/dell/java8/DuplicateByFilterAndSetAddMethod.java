package com.dell.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateByFilterAndSetAddMethod {
    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 1, 3, 7, 2, 9, 9, 4};

        Set<Integer> set = new HashSet<>();
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().filter(a -> !set.add(a)).collect(Collectors.toList());

        System.out.println(collect);
    }
}

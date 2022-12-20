package com.dell.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateByGrouping {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "a", "a", "b", "b", "c");

        Set<String> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(a -> a.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println(collect);

    }
}

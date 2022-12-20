package com.dell.app;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters3 {
    public static void main(String[] args) {
        String str = "jay prakash kumar";

        final List<String> collect = Arrays
                .asList(str.replaceAll(" ", "").split(""))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(a -> a.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}

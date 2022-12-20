package com.dell.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithOne {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,15,8,49,25,98,102,203,1002,32);
        /*List<String> collect = integerList.stream().map(String::valueOf).filter(a -> a.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect);
        integerList.stream().map(s->s+"").filter(a->a.startsWith("1")).forEach(System.out::println);*/

        List<String> collect = integerList.stream().map(String::valueOf).filter(a -> a.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect);
    }
}

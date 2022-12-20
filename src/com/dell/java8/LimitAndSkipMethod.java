package com.dell.java8;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkipMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
        //list.stream().limit(5).forEach(System.out::println);
        list.stream().skip(5).forEach(System.out::print);

    }
}

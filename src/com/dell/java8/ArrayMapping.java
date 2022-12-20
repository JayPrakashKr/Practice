package com.dell.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayMapping {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
    }


}

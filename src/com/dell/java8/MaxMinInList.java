package com.dell.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
        /*Integer max = list.stream().max(Integer::compare).get();
        Integer min = list.stream().min(Integer::compare).get();
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);*/

        Integer integer = list.stream().min(Integer::compareTo).get();
        System.out.println(integer);
    }
}

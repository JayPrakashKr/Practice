package com.dell.java8;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateByFilterAndSetAddMethod2 {
    public static void main(String[] args) {
        String str[] = {"Raja","Prakash","jay","Prakash","jay","prakash", "prakash","KUmar","Jaddu"};
       // List<String> list = Arrays.asList("Raja","Prakash","jay","Prakash","jay","prakash", "prakash","KUmar","Jaddu");
       Set<String> set = new HashSet<>();
        /*Set<String> collect = Arrays.stream(str).filter(a -> !set.add(a)).collect(Collectors.toSet());
        System.out.println(collect);*/

        List<String> collect = /*Arrays.asList(str).stream().*/Arrays.stream(str).filter(a -> !set.add(a)).collect(Collectors.toList());
        System.out.println(collect);
    }
}

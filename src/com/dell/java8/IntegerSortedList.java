package com.dell.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerSortedList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> accendingSort = myList.stream().sorted().collect(Collectors.toList());
        List<Integer> decendingSort = myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Accending sorted "+accendingSort);
        System.out.println("Decending sorted "+decendingSort);
    }
    
}

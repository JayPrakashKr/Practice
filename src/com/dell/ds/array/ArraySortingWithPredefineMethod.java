package com.dell.ds.array;

import java.util.Arrays;

public class ArraySortingWithPredefineMethod {

    public static void main(String[] args) {
        int[] array = new int[] {1,2,4,6,9,3,6,0};
        for(int i = 0;i< array.length;i++){
            System.out.print(array[i]+ " ");
        }
        Arrays.sort(array);
        System.out.println();
        for(int i = 0;i< array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }

}

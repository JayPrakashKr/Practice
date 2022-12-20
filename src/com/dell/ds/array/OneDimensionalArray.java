package com.dell.ds.array;

public class OneDimensionalArray {
    public static void main(String[] args) {
        //creating 1D Array
        int[] array = new int[10];
        int count = 1;
        for(int i=0;i< array.length;i++){
            array[i]=count;
            count++;
        }

        //printing 1D Array

        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}

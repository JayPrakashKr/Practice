package com.dell.ds.array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //creating 2D Array

        int[][] array = new int[3][4];
        int count = 1;

        for(int i =0;i< array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=count;
                count++;
            }
        }

        for(int i =0;i< array.length;i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

package com.dell.app;

public class MissingNumber2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10};

        int totalSum = ((arr.length+1)*(arr.length+2))/2;
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Missing number is "+(totalSum-sum));
    }
}


package com.dell.app;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int missingNumber = findMissingNumber(arr);
        System.out.println(missingNumber);
    }
    private static int findMissingNumber(int[] arr) {
        int length = arr.length;
        int sumIncludingMissingNumber = ((length + 1) * (length + 2)) / 2;
        int sumWithoutMissingNumber = 0;
        for (int a : arr) {
            sumWithoutMissingNumber = sumWithoutMissingNumber + a;
        }
        return sumIncludingMissingNumber - sumWithoutMissingNumber;
    }
}


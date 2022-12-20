package com.dell.app;

public class SeregateZeroAndOne2 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1};
        int zeroCount = 0;

       for(int i = 0;i< arr.length;i++){
           if(arr[i]==0){
               zeroCount++;
           }
       }

       for(int i = 0; i<zeroCount;i++){
           arr[i]=0;
       }

       for(int i = zeroCount;i< arr.length; i++){
           arr[i]=1;
       }

       for(int a : arr){
            System.out.print(a +" ");
       }
    }
}

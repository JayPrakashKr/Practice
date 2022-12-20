package com.dell.ds.array;

public class ArraySearching {
    public static void main(String[] args) {
        int[] array = new int[] {3,1,0,5,2,8,6,9,4};
        int search = search(array, 1);
        if(search==-1){
            System.out.println("Element not found!!!");
        }else {
            System.out.println("Element found at Index " + search);
        }
}

    private static int search(int[] arr, int key){

        for(int i = 0;i<arr.length;i++){
            if(arr[i]==key){
                return i;

            }
        }
        return -1;
    }
}

package src.com.dell.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumberInArray2 {
    public static void main(String[] args) {
        int[] arr = new int[10];//{-1,-1,2,3,6,5};
        int count = 1;
        for(int i = 0; i<arr.length;i++){
            arr[i]=count;
            count++;
        }
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int highest = 0;
        int secondHighest = 0;

        for(int i = 0; i< arr.length; i++){
            if(arr[i]>highest){
                highest=arr[i];
            }else if(arr[i] > secondHighest/* && arr[i] < highest*/){
                secondHighest=arr[i];
            }
        }
        System.out.println("Highest "+highest);
        System.out.println("Second Highest "+secondHighest);
    }
}

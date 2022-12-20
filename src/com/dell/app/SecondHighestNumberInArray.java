package src.com.dell.app;

public class SecondHighestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>largest){
               largest=arr[i];
            }
           else if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}

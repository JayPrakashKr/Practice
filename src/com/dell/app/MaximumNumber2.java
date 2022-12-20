package src.com.dell.app;

public class MaximumNumber2 {
    public static void main(String[] args) {
        int arr[] = {9,12,0,1,7,15,18,-2,-67,33,5};
        int max = arr[0];
        for(int i = 0;i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
     }
}

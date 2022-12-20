package src.com.dell.app;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {9,12,0,1,7,15,18};
        int maxnum = arr[0];
        for (int i=0; i< arr.length; i++){
            if(arr[i]>maxnum){
                maxnum=arr[i];
            }
        }
        System.out.println(maxnum);
    }
}

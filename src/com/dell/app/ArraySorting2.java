package src.com.dell.app;

public class ArraySorting2 {
    public static void main(String[] args) {
        int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};

        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int a : arr){
            System.out.print(a+" ");
        }
    }

}

package src.com.dell.app;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
        int index = findIndex(arr, 70);

        if(index>=0){
            System.out.println("Index found at index "+index);
        }else {
            System.out.println("Sorry Index not found!!!");
        }
    }

    private static int findIndex(int[] arr, int num) {
        for(int i = 0; i< arr.length; i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}

package src.com.dell.app;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};

        int index = findArray(arr, 80);

        if (index >= 0) {
            System.out.println("number found at index " + index);
        } else {
            System.out.println("sorry number not found!!");
        }

    }

    private static int findArray(int[] arr, int num) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == num) {
                return index;
            }
        }
        return -1;
    }

}

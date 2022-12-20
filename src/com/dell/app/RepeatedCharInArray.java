package src.com.dell.app;

public class RepeatedCharInArray {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 1, 2, 3, 4, 1, 5, 6, 6};
        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            count = 1;
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    count++;
                    //to avoid visited character while printing
                    intArray[j] = '0';
                }
            }
            if (count > 1 && intArray[i] != '0') {
                System.out.print(intArray[i] + " ");
            }
        }

    }
}

package src.com.dell.app;

public class RepeatedCharInArray2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 4, 1, 5, 6, 6};
        int count = 0;

        for(int i = 0; i<arr.length;i++){
            count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    //to avoid repeated char
                    arr[j]='0';
                }
            }
            if(count>1 && arr[i]!='0'){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

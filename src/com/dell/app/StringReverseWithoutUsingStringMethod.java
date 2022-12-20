package src.com.dell.app;

public class StringReverseWithoutUsingStringMethod {
    public static void main(String[] args) {
        String str = "Jay Prakash";
       /* char[] chars = str.toCharArray();
        for(int i= chars.length-1;i>=0;i--){
            System.out.print(chars[i]);
        }*/
        String[] s = str.split("");

        for(int i=s.length-1;i>=0;i--){
            System.out.print(s[i]);
        }
    }
}

package src.com.dell.app;

public class StringReverseUsingStringBuilder {
    public static void main(String[] args) {
        String str = "Jay Prakash Kumar";
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
    }
}

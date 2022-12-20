package src.com.dell.app;

public class DuplicateCharacter3 {
    public static void main(String[] args) {
        String str = new String("jay prakash kumar");
        char[] split = str.replaceAll(" ", "").toCharArray();
        int count = 0;
        for(int i = 0; i< split.length; i++){
            count = 1;
            for(int j = i+1; j< split.length; j++){
                if(split[i]==split[j]){
                    count++;
                    split[j] = '0';
                }
            }
            if(count>1 && split[i]!='0'){
                System.out.println(split[i]);
            }
        }
    }
}

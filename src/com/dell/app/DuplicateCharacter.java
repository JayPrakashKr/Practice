package src.com.dell.app;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = new String("jay prakash kumar");
        char[] string = str.replaceAll(" ","").toCharArray();
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j]) {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if (count > 1 && string[i] != '0')
                System.out.println(string[i]);

        }
       //  System.out.println("Total number of duplicate "+count);
    }
}

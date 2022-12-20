package src.com.dell.app;

public class Armstrong2 {
    public static void main(String[] args) {
        int givenNumber = 404;
        int temp = givenNumber;
        int a = 0,total =0;
        while(givenNumber>0){
            a = givenNumber%10;
            total = total+(a*a*a);
            givenNumber = givenNumber/10;
        }
        if(temp == total){
            System.out.println("Its Armstsrong number");
        }else {
            System.out.println("Its not Armstrong number");
        }
    }
}

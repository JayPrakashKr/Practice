package src.com.dell.app;

public class Armstrong {
    public static void main(String[] args) {
        int givenNumber = 407;
        int temp = givenNumber;
        int c=0,a=0;

        while (givenNumber>0){
            a = givenNumber % 10;
            c = c+(a*a*a);
            givenNumber = givenNumber/10;
        }
        if(temp==c){
            System.out.println("This is Armstrong Number");
        }else{
            System.out.println("This is not Armstrong Number");
        }
    }
}

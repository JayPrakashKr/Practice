package com.dell.app;

public class SwappingThreeNumber {
    public static void main(String[] args) {

        //given values

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("Before swapping a = "+a+" b = "+b+" c = "+c);

        a = a+b; // 30
        b = b+c; // 50
        c = c+a; // 40

        a = b-a;
        b = b-a;
        c = b-a;

        System.out.println("After swapping a = "+a+" b = "+b+" c = "+c);

        //a = 10;
        //b = 20;

        //a = a+b;//30
        //b = a-b //10
        //a = a-b //20
    }
}

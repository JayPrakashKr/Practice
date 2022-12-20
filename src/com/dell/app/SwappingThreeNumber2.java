package com.dell.app;

public class SwappingThreeNumber2 {
    public static void main(String[] args) {

        int a = 10; //20
        int b = 20; //30
        int c = 30; //10

        System.out.println("Before swapping a = "+a+" b = "+b+" c = "+c);

        a = a+b; //30
        b = b+c; //50
        c = c+a; //40

        a = b-a; //20
        b = b-a; //30
        c = b-a; //10

        System.out.println("After swapping a = "+a+" b = "+b+" c = "+c);
    }
}

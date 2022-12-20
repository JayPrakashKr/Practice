package com.dell.java8;

public class InterfTest implements Interf1,Interf2{

    @Override
    public void print() {
        Interf1.super.print();
    }
}
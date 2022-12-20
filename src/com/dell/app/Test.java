package com.dell.app;

import java.util.HashSet;
import java.util.Set;

/*
* Predicate -> public boolean test(Object o) {}
* Function  -> public Object apply(Object o) {}
* Consumer  -> public void accept(Object o) {}
* Supplier  -> public Object get() {}
*
* */

public class Test {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add("abc");

        set.add(new StringBuffer("abc"));

        System.out.println(set);
    }
}

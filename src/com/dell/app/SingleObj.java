package com.dell.app;

public class SingleObj {
    private static SingleObj obj = null;

    private SingleObj(){}

    public static SingleObj getInstance(){
        if(obj == null){
            synchronized(SingleObj.class){
                if(obj == null){
                    obj = new SingleObj();
                }
            }
        }
        return obj;
    }

    public static void main(String[] args) {
        SingleObj instance = getInstance();
        SingleObj singleObj = getInstance();

        System.out.println(instance.hashCode());
        System.out.println(singleObj.hashCode());
    }
}

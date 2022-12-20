package com.dell.app;

import java.util.HashMap;

public class DuplicateWordsInString {
    public static void main(String[] args) {
        String str = "my name my name is jay singh singh";
        String[] split = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for(String key : split){
            if(map.containsKey(key)){
                int count = map.get(key);
                map.put(key,count+1);
            }
            else {
                map.put(key,1);
            }
        }
        System.out.println(map);
    }
}

package com.dell.app;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInString2 {
    public static void main(String[] args) {
        String str = "my name my name is jay singh singh";
        String[] split = str.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i<split.length;i++){
            if(map.containsKey(split[i])){
                Integer integer = map.get(split[i]);
                map.put(split[i],integer+1 );
            }
            else{
                map.put(split[i],1);
            }
        }
        System.out.println(map);
    }
}

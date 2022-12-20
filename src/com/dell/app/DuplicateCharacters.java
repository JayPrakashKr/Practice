package com.dell.app;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "jayprakashkumar";

        /*char[] chars = str.toCharArray();

        int count;
        for (int i = 0; i < chars.length; i++) {
            count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == (chars[j])) {
                    count++;
                    chars[j] = '0';
                }
            }
            if (count > 1 && chars[i] != '0')
                System.out.println(chars[i]);
        }*/

        List<String> collect = Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(m -> m.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(collect);
    }
}

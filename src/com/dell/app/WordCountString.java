package src.com.dell.app;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountString {
    public static void main(String[] args) {
        String str = "jayprakashkumar";
        List<String> collect1 = Arrays.asList(str.split("")).stream().sorted(Comparator.naturalOrder()).distinct().collect(Collectors.toList());

        System.out.println(collect1);
        Map<String, Long> collect = Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
       /* String[] split = str.split("");
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i<split.length; i++){
            if(map.containsKey(split[i])){
                 count = map.get(split[i]);
                map.put(split[i],count+1 );
            }else{
                map.put(split[i], 1);
            }
        }
        System.out.println(map);*/
    }
}

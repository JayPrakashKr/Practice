package src.com.dell.app;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountString2 {
    public static void main(String[] args) {
        String str = "jay prakash kumar jay prakash kumar jay prakash kumar";

        Map<String, Long> collect = Arrays.asList(str.replaceAll(" ", "").split("")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}

package src.com.dell.app;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateCharacter2 {
    public static void main(String[] args) {
        String str = new String("jay prakash kumar");
        List<String> stringList = Arrays.asList(str.replaceAll(" ", "").split(""));
        Set<String> set = new HashSet<>();
        Set<String> collect1 = stringList.stream().filter(a -> !set.add(a)).collect(Collectors.toSet());
        System.out.println(collect1);

    }
}

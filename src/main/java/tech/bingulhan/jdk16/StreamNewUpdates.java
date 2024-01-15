package tech.bingulhan.jdk16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamNewUpdates {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("4", "3");
        List<Integer> ints = stringList.stream().map(Integer::parseInt).toList();
        ints.forEach(System.out::println);


    }
}

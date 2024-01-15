package tech.bingulhan.jdk21;

import java.util.Arrays;
import java.util.List;

public class SequencedCollections {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3,4,5);
        System.out.println(ints.getFirst()); // 1
        System.out.println(ints.getLast()); // 5
    }
}

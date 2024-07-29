package org.example.extra.parallelStream;

import java.util.Arrays;
import java.util.List;

public class Parallel {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().parallel().forEach(s -> System.out.println(s + "_" + Thread.currentThread().getId()));
    }


}

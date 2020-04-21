package com.company.myClass;

import java.util.List;
import java.util.Optional;

public class StreamAndFind {
    public void getFindAny(List<String> names) {
        Optional<String> anyName = names.stream()
                .findAny();
        System.out.println(anyName);
    }

    public void getFindAnyWithFilter(List<String> names) {
        Optional<String> anyName = names.stream()
                .filter(i -> i.contains("an"))
                .findAny();
        System.out.println(anyName);
    }

    public void getFindAnyWithFilterByParallelStream(List<String> names) {
        Optional<String> anyName = names.parallelStream()
                .filter(i -> i.contains("an"))
                .findAny();
        System.out.println(anyName);
    }

    public void getFindFirst(List<Integer> numbersList) {
        Optional<Integer> firstNumber = numbersList.stream()
                .filter(i -> i > 5)
                .findFirst();
        System.out.println(firstNumber);
    }
}

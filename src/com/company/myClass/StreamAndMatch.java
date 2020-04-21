package com.company.myClass;

import java.util.List;

public class StreamAndMatch {

    public void getAnyMatch(List<Integer> numbers) {
        boolean match = numbers.stream()
                .anyMatch(i -> i % 2 == 0);
        System.out.println(match);
    }

    public void getAllMatch(List<Integer> numbers) {
        boolean match = numbers.stream()
                .allMatch(i -> i % 1 == 0);
        System.out.println(match);
    }

    public void getNoneMatch(List<Integer> numbers) {
        boolean noneMatch = numbers.stream()
                .noneMatch(i -> i % 2 == 0);
        System.out.println(noneMatch);
    }
}

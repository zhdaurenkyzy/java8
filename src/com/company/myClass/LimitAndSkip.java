package com.company.myClass;

import java.util.List;

public class LimitAndSkip {

    public void getLimit(List<Integer> numbers){
        numbers.stream()
                .limit(5)
                .forEach(System.out::println);
    }

    public void getLimitExceeds(List<Integer> numbers){
        numbers.stream()
                .limit(20)
                .forEach(System.out::println);
    }

    public void getLimitNegative(List<Integer> numbers){
        numbers.stream()
                .limit(-1)
                .forEach(System.out::println); //output IllegalArgumentException
    }

     public void getSkip(List<Integer> numbers){
        numbers.stream()
                .skip(5)
                .forEach(System.out::println);
     }

    public void getSkipExceeds(List<Integer> numbers){
        numbers.stream()
                .skip(11)
                .forEach(System.out::println);
    }

    public void getSkipNegative(List<Integer> numbers){
        numbers.stream()
                .skip(-5)
                .forEach(System.out::println); //output IllegalArgumentException
    }

}

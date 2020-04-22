package com.company.myClass;

import java.util.List;
import java.util.Optional;

public class StreamAndReduce {
    public void getSum(List<Integer> numbers){
        Optional<Integer> sum = numbers.stream()
                .reduce((x, y) -> x + y);
        sum.ifPresent(System.out::println);
    }

    public void getSumWithIdentity(List<Integer> numbers){
       Integer sum = numbers.stream()
                .reduce(10, (x, y) -> x + y);
        System.out.println(sum);
    }

    public void getSumWithIdentityAndCombiner(List<Integer> numbers){
        Integer sum = numbers.stream()
                .reduce(10, (identity, val) ->identity * val,  (x, y) -> x + y);
        System.out.println(sum);
    }

    public void getMinValue(List<Integer> numbers){
        Integer min = numbers.stream()
                .reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);
        System.out.println(min);
    }

    public void getMinString(List<String> names){
        String name = names.stream()
                .reduce("", (x, y) -> x.length() < y.length() ? x : y);
        System.out.println(name);
    }
}

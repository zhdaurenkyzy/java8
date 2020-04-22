package com.company.myClass;

import java.util.List;


public class DebugWithPeek {

    private void debug(Integer n){
        System.out.println(n);
    }
    private static void doSomeStuff(Integer n){
        //some method
    }

    public void getDebug(List<Integer> numbers){
        numbers.stream()
                .peek(n -> debug(n))
                .forEach(n -> doSomeStuff(n));
    }

    public void getDebugWithMethodReference(List<Integer> numbers){
        numbers.stream()
                .peek(System.out::println)
                .forEach((DebugWithPeek::doSomeStuff));
    }
}

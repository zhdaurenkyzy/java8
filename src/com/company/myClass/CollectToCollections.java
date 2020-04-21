package com.company.myClass;

import java.util.*;
import java.util.stream.Collectors;

public class CollectToCollections {
    public void getEvenNumbers(List<Integer> numbers){
        List<Integer> evenNumbers = new ArrayList<>();
        for(Integer i : numbers){
            if(i % 2 == 0){
                evenNumbers.add(i);
            }
        }
        System.out.println(evenNumbers);
    }

    public void getEvenNumbersByCollect(List<Integer> numbers){
        List<Integer> evenNumbers = numbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

    public void getUpperCase(List<String> names){
        Set<String> upperCaseNames = new HashSet<>();
        for(String name : names){
            upperCaseNames.add(name.toUpperCase());
        }
        System.out.println(upperCaseNames);
    }

    public void getUpperCaseByCollectToSet(List<String> names){
        Set<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(upperCaseNames);
    }

    public void getIsNotEmptyName(List<String> names){
        Queue<String> queue = new LinkedList<>();
        for(String name : names){
            if(!name.isEmpty()){
                queue.add(name);
            }
        }
        System.out.println(queue);
    }

    public void getIsNotEmptyNameBySet(List<String> names){
        Queue<String> queue = names.stream()
                .filter(i -> !i.isEmpty())
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(queue);
    }
}

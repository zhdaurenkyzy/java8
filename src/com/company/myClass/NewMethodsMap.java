package com.company.myClass;


import java.util.HashMap;
import java.util.Map;

public class NewMethodsMap {

    public void getBeforePutIfAbsent(){
        Map<Integer, Integer> numbersMap = new HashMap<>();
        if(numbersMap.get(4)==null){
            numbersMap.put(4, 40);
        }
    }

    public void getPutIfAbsent(){
        Map<Integer, Integer> numbersMap = new HashMap<>();
        numbersMap.putIfAbsent(4, 40);
    }

    public void getComputeIfPresentAndAbsent(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ivan");
        map.computeIfPresent("name", (key, value) -> key + ", " + value);
        map.computeIfAbsent("surname", key -> key + " - " + "Ivanov");
        System.out.println(map.get("name"));
        System.out.println(map.get("surname"));
    }

    public void getRemove(){
        Map<String, String> map = new HashMap<>();
        map.put("surname", "Petrov");
        map.remove("surname", "Ivanov");
        System.out.println(map.get("surname"));
    }

    public void getGetOrDefault(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "Maria");
        System.out.println(map.getOrDefault("surname", "Ivan"));
    }

    public void getMerge(){
        Map<String, String> map = new HashMap<>();
        map.put("phrase", "Just do");
        map.merge("phrase", "it!", (oldVal, newVal) -> oldVal + " " + newVal);
        System.out.println(map.get("phrase"));
    }
}

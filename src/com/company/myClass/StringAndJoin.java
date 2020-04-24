package com.company.myClass;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringAndJoin {

    public void getCreateStringJoiner(){
        StringJoiner stringJoiner = new StringJoiner(". ", "(", ")");
        stringJoiner.add("March");
        stringJoiner.add("April");
        stringJoiner.add("May");
        System.out.println(stringJoiner);
    }

    public void getJoinString(){
        String number = String.join("-", "1", "2", "3");
        System.out.println(number);
    }

    public void getJoinStringIterable(List<String> names){
        String string = String.join(", ", names);
        System.out.println(string);
    }

    public void getCollectionToString(List<String> names){
        String collect = names.stream()
                .collect(Collectors.joining("-", "{", "}"));
        System.out.println(collect);
    }

}

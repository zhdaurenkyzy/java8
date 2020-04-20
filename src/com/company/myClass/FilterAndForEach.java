package com.company.myClass;

import java.util.List;
import java.util.Objects;

public class FilterAndForEach {
    public void getForEach(List<Integer> numbers) {
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void getFilter(List<Integer> numbers) {
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }

    public void getCountName(List<User> users) {
        int count = 0;
        for (User user : users) {
            if (user.getName().length() > 4) {
                count++;
            }
        }
        System.out.println("Count of names Name with more than 4 letters " + count);
    }

    public void getCountNameByFilter(List<User> users) {
        long count = users.stream()
                .filter(user -> user.getName().length() > 4)
                .count();
        System.out.println("Count of names with more than 4 letters by filter " + count);
    }

    public void getNameContainingA(List<User> users){
        for(User user:users){
            if(user.getName()!=null && !user.getName().isEmpty() && user.getName().contains("a")){
                System.out.println(user.getName());
            }
        }
    }

    public void getNameContainingAByFilter(List<User> users){
        users.stream()
                .filter(Objects::nonNull)
                .filter(user -> !user.getName().isEmpty() && user.getName().contains("a"))
                .forEach(user -> System.out.println(user.getName()));
    }
}

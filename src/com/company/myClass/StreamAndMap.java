package com.company.myClass;

import java.util.List;


public class StreamAndMap {
    public void getForEach(List<Integer> numbers){
        for(Integer i:numbers){
            System.out.println(i * 2);
        }
    }

    public void getUseMap(List<Integer> numbers){
        numbers.stream()
                .map(i -> i * 2)
                .forEach(System.out::println);
    }

    public void getUser(List<User> users) {
        for (User user : users) {
            if (user.getAge() > 20) {
                String name = user.getName();
                if (!user.getName().isEmpty() && user.getName() != null) {
                    System.out.println(user.getName());
                }
            }
        }
    }
    public void getUserByMapAndFilter(List<User> users) {
        users.stream()
                .filter(i -> i.getAge()>20)
                .map(User::getName)
                .filter(i -> !i.isEmpty() && i!=null)
                .forEach(System.out::println);
    }
}

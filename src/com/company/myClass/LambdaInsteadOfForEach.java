package com.company.myClass;

import java.util.List;
import java.util.Map;

public class LambdaInsteadOfForEach {
    public void getForEach(List<User> users){
        System.out.println("getForEach: ");
        for(User user:users){
            System.out.println(user);
        }
    }

    public void getForEachByLambda(List<User> users){
        System.out.println("lambdaForEach: ");
        users.forEach(user -> System.out.println(user));
    }

    public void methodReference(List<User> users){
        System.out.println("methodReference: ");
        users.forEach(System.out::println);
    }

    public void getForEachByEntrySetMap(Map<Integer, Integer> numbers) {
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            System.out.println("Key " + entry.getKey() + ", value " + entry.getValue());
        }
    }

    public void getForEachByLambdaMap(Map<Integer, Integer> numbers){
    numbers.forEach((k, v) -> System.out.println("Key " + k + ", value " + v));
        }

    public void getForEachWithTerms(List<User> users){
        for(User user: users){
            if(user.getAge()>20){
                System.out.println("User age > 20 = " + user.getAge());
            }
        }
    }

    public void getForEachWithTermsByLambda(List<User> users){
        users.forEach(user -> {
            if(user.getAge()>20) {
                System.out.println("User age > 20 = " + user.getAge());
            }
        });
    }

}

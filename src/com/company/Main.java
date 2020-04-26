package com.company;

import com.company.myClass.*;
import com.company.myInterface.MyCustomPredicate;
import com.company.myInterface.UserFactory;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Nicole", "Smith", 38, 1),
                new User("Alex", "Williams", 20, 2),
                new User("", "Smith", 35, 3),
                new User("Michael", "Williams", 10, 4));

        Map<Integer, Integer> numbersMap = new HashMap<>();
        numbersMap.put(1, 10);
        numbersMap.put(2, 20);
        numbersMap.put(3, 30);

        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> names = Arrays.asList("jane", "sasha", "ivan", "", "marry");
        List<User> humans = Arrays.asList(
                new User("Jane", Arrays.asList("Buddy", "Lucy")),
                new User("Sasha", Arrays.asList("Frankie", "Rosie")),
                new User("Ivan", Arrays.asList("Simba", "Tilly")));

        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};

        ComparatorAndLambda comparatorAndLambda = new ComparatorAndLambda();
        comparatorAndLambda.getText("Before sort", users);
        comparatorAndLambda.getSortByLambda(users);

        LambdaInsteadOfForEach lambdaInsteadOfForEach = new LambdaInsteadOfForEach();
        lambdaInsteadOfForEach.getForEachWithTermsByLambda(users);

        MyCustomPredicate predicate = x -> x < 10;
        System.out.println("With help of functional interface and without creating anonymous inner class" +
                " predicate = " + predicate.test(5));

        UserFactory userFactory = User::new; //instead of implementing the interface, use constructor reference
        User user = userFactory.create("Bryan", 40);

        FilterAndForEach filter = new FilterAndForEach();
        filter.getFilter(numbersList);
        filter.getCountNameByFilter(users);
    }

}

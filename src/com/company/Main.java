package com.company;

import com.company.myClass.*;
import com.company.myInterface.MyCustomPredicate;
import com.company.myInterface.UserFactory;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Nicole", 38),
                new User("Alex", 20),
                new User("", 35),
                new User("Michael", 10));
        Map<Integer, Integer> numbersMap= new HashMap<>();
        numbersMap.put(1, 10);
        numbersMap.put(2, 20);
        numbersMap.put(3, 30);

        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> names = Arrays.asList("jane", "sasha", "ivan", "", "marry");

        ComparatorAndLambda comparatorAndLambda = new ComparatorAndLambda();
        comparatorAndLambda.getText("Before sort", users);
        comparatorAndLambda.getSortByComparator(users);
        comparatorAndLambda.getSortByLambda(users);

        LambdaInsteadOfForEach lambdaInsteadOfForEach = new LambdaInsteadOfForEach();
        lambdaInsteadOfForEach.getForEachByEntrySetMap(numbersMap);
        lambdaInsteadOfForEach.getForEachWithTermsByLambda(users);

        MyCustomPredicate predicate = x -> x < 10;
        System.out.println("With help of functional interface and without creating anonymous inner class" +
                " predicate = " + predicate.test(5));

        UserFactory userFactory = User::new; //instead of implementing the interface, use constructor reference
        User user = userFactory.create("Bryan", 40);

        FilterAndForEach filter = new FilterAndForEach();
        filter.getFilter(numbersList);
        filter.getCountName(users);
        filter.getCountNameByFilter(users);

        StreamAndMap streamAndMap = new StreamAndMap();
        streamAndMap.getUseMap(numbersList);
        streamAndMap.getUserByMapAndFilter(users);

        CollectToCollections collectToCollections = new CollectToCollections();
        collectToCollections.getEvenNumbersByCollect(numbersList);
        collectToCollections.getIsNotEmptyNameBySet(names);
    }
}

package com.company;

import com.company.myClass.ComparatorAndLambda;
import com.company.myClass.FilterAndForEach;
import com.company.myClass.LambdaInsteadOfForEach;
import com.company.myClass.User;
import com.company.myInterface.MyCustomPredicate;
import com.company.myInterface.UserFactory;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Nicole", 18),
                new User("Alex", 20),
                new User("Michael", 35));
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 10);
        numbers.put(2, 20);
        numbers.put(3, 30);

        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> names = Arrays.asList("Jane", "Sasha", "Ivan", "Nicole", "Marry");

        ComparatorAndLambda comparatorAndLambda = new ComparatorAndLambda();
        comparatorAndLambda.getText("Before sort", users);
        comparatorAndLambda.getSortByComparator(users);
        comparatorAndLambda.getSortByLambda(users);

        LambdaInsteadOfForEach lambdaInsteadOfForEach = new LambdaInsteadOfForEach();
        lambdaInsteadOfForEach.getForEachByEntrySetMap(numbers);
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
    }

}

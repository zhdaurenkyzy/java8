package com.company.myClass;

import java.util.*;

public class ComparatorAndLambda {

    public void getText(String text, List<User> users) {
        System.out.println(text);
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getAge());
        }
    }

public  void getSortByComparator(List<User> users){
            Collections.sort(users, new Comparator<User>() {
                @Override
                public int compare(User o1, User o2) {
                    return o1.getAge() - o2.getAge();
                }
            });
            getText("Before sort", users);
        }

        public void getSortByLambda(List<User>users){
            Collections.sort(users, (o1, o2) -> o1.getAge() - o2.getAge());
            getText("After sort by lambda", users);
        }

    public void getSortByListSort(List<User>users){
        users.sort((o1, o2) -> o1.getAge() - o2.getAge());
        getText("After list's sort method", users);
    }

    public void reversed(List<User>users){
        Comparator<User> comparator = (o1, o2) -> o1.getAge() - o2.getAge();
        users.sort(comparator.reversed());
        getText("After reversed method", users);
    }

    public void sortNameByComparator(List<User>users){
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        getText("After sort by name", users);
    }

    public void sortNameByLambda(List<User>users){
        users.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        getText("After sort name by lambda", users);
    }

    public void reversedNameByLambda(List<User>users){
        Comparator<User> comparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        users.sort(comparator.reversed());
        getText("After reversed name by lambda", users);
    }

    public void sortWithSomeTerms(List<User>users){
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(o1.getAge()==o2.getAge()){
                    return o1.getName().compareTo(o2.getName());
                }
                else return o1.getAge()-o2.getAge();
            }
        });
        getText("After sortWithSomeTerms by comparator", users);
    }

    public void sortWithSomeTermsByLambda(List<User> users) {
        users.sort(((o1, o2) -> {
            if (o1.getAge() == o2.getAge())
                return o1.getName().compareTo(o2.getName());
            else return o1.getAge() - o2.getAge();
        }
        ));
        getText("After sortWithSomeTerms by lambda", users);
    }

    }


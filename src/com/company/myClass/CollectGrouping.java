package com.company.myClass;

import java.util.*;
import java.util.stream.Collectors;

public class CollectGrouping {
        public void getGroupingBySurname(List<User> users){
            Map<String, List<User>> map = new HashMap<>();
            for(User user : users){
                if(!map.containsKey(user.getSurname())){
                    List<User> userList = new ArrayList<>();
                    userList.add(user);
                    map.put(user.getSurname(), userList);
                }else {
                    List<User> userList = map.get(user.getSurname());
                    userList.add(user);
                }
            }
            System.out.println(map);
        }

      public void getGroupingBySurnameAndCollect(List<User> users){
            Map<String, List<User>> map = users.stream()
                    .collect(Collectors.groupingBy(User::getSurname));
          System.out.println(map);
      }

    public void getGroupingAndCountingBySurnameAndCollect(List<User> users){
        Map<String, Long> map = users.stream()
                .collect(Collectors.groupingBy(User::getSurname, Collectors.counting()));
        System.out.println(map);
    }

    public void getGroupingAndSumBySurnameAndCollect(List<User> users){
        Map<String, Integer> map = users.stream()
                .collect(Collectors.groupingBy(User::getSurname, Collectors.summingInt(User::getFriendsAmount)));
        System.out.println(map);
    }

    public void getGroupingAndMappingBySurname(List<User> users){
        Map<String, Set<String>> map = users.stream()
                .collect(Collectors.groupingBy(User::getSurname
                ,Collectors.mapping(User::getName, Collectors.toSet())));
        System.out.println(map);
    }
}

package com.company.myClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethods {

    public void getPetsList(List<User> users) {
        List<String> petsList = new ArrayList<>();
        for (User user : users) {
            petsList.addAll(user.getPets());
        }
        System.out.println(petsList);
    }

    public void getPetsListByFlatMap(List<User> users) {
        List<String> petsList = users.stream()
                .map(user -> user.getPets())
                .flatMap(pet -> pet.stream())
                .collect(Collectors.toList());
        //or can use: users.stream().flatMap(user -> user.getPets().stream())
        System.out.println(petsList);
    }

    public void getSingleDimensionArray(int[][] arr) {
        int[] newArr = new int[arr.length * arr[0].length];

        for (int i = 0, index = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[index++] = arr[i][j];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    public void getSingleDimensionArrayByFlatMapInt(int[][] arr) {
        int[] newArr = Arrays.stream(arr)
                .flatMapToInt(i -> Arrays.stream(i))
                .toArray();
        //or can use flatMap(Arrays::stream)
        System.out.println(Arrays.toString(newArr));
    }
}

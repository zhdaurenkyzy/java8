package com.company.myClass;

import java.util.List;

public class User {
    private String name;
    private String surname;
    private int age;
    private int friendsAmount;
    private List<String> pets;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, String surname, int age, int friendsAmount) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.friendsAmount = friendsAmount;
    }

    public User(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getFriendsAmount() {
        return friendsAmount;
    }

    public void setFriendsAmount(int friendsAmount) {
        this.friendsAmount = friendsAmount;
    }

    public List<String> getPets() {
        return pets;
    }
}

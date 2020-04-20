package com.company.myInterface;

import com.company.myClass.User;

public interface UserFactory {
    User create(String name, int age);
}

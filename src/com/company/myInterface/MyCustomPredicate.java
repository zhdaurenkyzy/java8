package com.company.myInterface;

@FunctionalInterface
public interface MyCustomPredicate {
    boolean test(Integer value);
    boolean equals(Object obj);
}

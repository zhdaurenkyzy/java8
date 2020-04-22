package com.company.myClass;


import java.util.Optional;

public class OptionalMethods {

    public void getCreateMethods() {
        Optional<String> optional = Optional.of("Marry");
        Optional<Integer> emptyOptional = Optional.empty();
        Optional<String> optionalNullable = Optional.ofNullable("John");
        Optional<String> optionalEmpty = Optional.ofNullable(null);
        // Optional<String> optionalException = Optional.of(null); output NullPointerException
    }

    public void getIsPresent() {
        Optional<String> optional = Optional.of("Marry");
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
    }

    public void getIfPresent() {
        Optional<String> optionalInteger = Optional.of("Marry");
        optionalInteger.ifPresent(val -> System.out.println(val));
    }

    public void getMethodsOrElse() {
        Optional<String> optionalJohn = Optional.of("John");
        System.out.println(optionalJohn.orElse("Marry"));

        Optional<Object> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty.orElseGet(() -> "Marry"));
    }

    public void getOrElseThrow() {
        Optional<String> optional = Optional.of("Marry");
        optional.orElseThrow(() -> new RuntimeException());
    }

}

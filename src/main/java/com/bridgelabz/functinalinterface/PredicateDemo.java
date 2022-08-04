package com.bridgelabz.functinalinterface;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> checkLength=str->str.length()>5;
        System.out.println(checkLength.test("adc"));
    }
}

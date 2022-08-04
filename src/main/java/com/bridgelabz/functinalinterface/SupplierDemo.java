package com.bridgelabz.functinalinterface;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> getRandomDouble=()-> Math.random();
        System.out.println(getRandomDouble.get());
    }
}

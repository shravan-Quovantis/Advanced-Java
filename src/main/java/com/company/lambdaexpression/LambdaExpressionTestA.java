package com.company.lambdaexpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressionTestA {
    public static void main(final String[] args) {
        final ArrayList<Integer> customerId = new ArrayList<>();
        customerId.add(6);
        customerId.add(8);
        customerId.add(9);
        customerId.add(1);

        System.out.println("Customer ID: ");
        Consumer<Integer> consumeA = n -> System.out.println(n);
        //customerId.forEach(consumeA);
        customerId.forEach(System.out::println);

        System.out.println("Customer ID: ");
        final Consumer<Integer> consumeB = System.out::println;            //Method reference
        customerId.forEach(consumeB);
    }
}
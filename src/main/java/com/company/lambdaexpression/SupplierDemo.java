package com.company.lambdaexpression;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(final String[] args) {

        final Supplier<String> supplier = () ->{
            final String[] countries = {"India", "America", "China"};
            final int index = (int)(Math.random()*2%3);
            return countries[index];
        };

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}

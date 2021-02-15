package com.company.CollectionAPI;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionAPIDemo {
    public static void main(final String[] args) {
        Collection<String> stringList = Arrays.asList("IT", "Finance", "Management", "Automotive", "Telecom");
        Collection<String> domains = new ArrayList<>(stringList);
        System.out.println("All domains: ");
        domains.forEach(System.out::println);
        System.out.println();

        if (CollectionUtils.isNotEmpty(domains)) {

            //Applying conditions in collections list using lambda expression
            System.out.println("Domains which has less than 7 characters:");
            domains.removeIf(domain -> domain.length() > 7);
            domains.forEach(System.out::println);
            System.out.println();

            //replaceAll Method
            List<String> statuses = Arrays.asList("Continue", "Working", "Work in Progress");
            statuses.replaceAll(domain -> domain + "...");
            statuses.forEach(System.out::println);
        }
    }
}

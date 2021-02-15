package com.company.streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(final String[] args) {
        List<Integer> vehicleNumbers = Arrays.asList(1, 200, 85, 7, 90, 44, 17);
        System.out.println("All Vehicles:              " + vehicleNumbers);

        final List<Integer> evenVehicleNumbers = vehicleNumbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Vehicles with even number: " + evenVehicleNumbers);

        final List<Integer> oddVehicleNumbers = vehicleNumbers.stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Vehicles with odd number:  " + oddVehicleNumbers);

        final List<Integer> filteredAndMapping = vehicleNumbers.stream().
                filter(i->i>85).map(i->i+100).
                collect(Collectors.toList());
        System.out.println("Vehicle number greater than 85 is added 100: " +filteredAndMapping);

        final long noOfVehicle = vehicleNumbers.stream().
                filter(i -> i % 2 == 0).
                count();
        System.out.println("count of Even number vehicle: " + noOfVehicle);

        final List<Integer> manipulatedVehicleNumbers = vehicleNumbers.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList());
        System.out.println("Vehicles numbers doubled:  " + manipulatedVehicleNumbers);

        final List<Integer> sortedListA = vehicleNumbers.stream().
                sorted().collect(Collectors.toList());
        System.out.println("Sorted numbers:            " + sortedListA);

        final List<Integer> sortedListB = vehicleNumbers.stream().
                sorted((a, b) -> (b.compareTo(a))).collect(Collectors.toList());
        System.out.println("Decreasing order:           "+sortedListB);

        final int maxValue = vehicleNumbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max value:                 " +maxValue);

        System.out.println("Items in list using forEach method: ");
        vehicleNumbers.stream().forEach(System.out::println);

        //Reduce methods
        Optional<Integer> reducedResult = vehicleNumbers.stream().
                reduce((a, b) -> a + b);
        System.out.println("\nSimple Reduce: "+ reducedResult);

        int constant = 10;
        //It will add the constant value after summing all the values
        int reducedConstantResult = vehicleNumbers.stream().
                reduce(constant, (a, b) -> a + b);
        System.out.println("Reduce with a variable constant 10: "+ reducedConstantResult);

        //It will add the constant value every time whenever it combines
        System.out.println("Reduce with parallel combiner");
        int reducedCombinerResult = vehicleNumbers.stream().
                parallel().
                reduce(10, (a, b) -> a + b, (a, b) -> {
            System.out.println("combiner is called");
            return a + b;
        });

        System.out.println("Parallel reduce of Vehicle numbers: "+ reducedCombinerResult);

        OptionalInt reducedA = IntStream.range(1, 4).
                reduce((a, b) -> a + b);
        System.out.println("\nReduce with range of value: "+reducedA);

        System.out.println("Demonstration of parallel stream");
        int reducedC = Arrays.asList(1, 2, 3).
                parallelStream().
                reduce(constant, (a, b) -> a + b, (a, b) -> {
            System.out.println("combiner is called");
            return a + b;
        });
        System.out.println("Parallel reduce:"+ reducedC);
    }
}

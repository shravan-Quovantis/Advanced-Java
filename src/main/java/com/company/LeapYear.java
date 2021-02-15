package com.company;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(final String[] args) {
        System.out.println("Check the Year is leap or not");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year: ");

        Year year = Year.of(scanner.nextInt());
        if(year.isLeap()){
            System.out.println("Year is Leap Year");
        }else{
            System.out.println("Year is not Leap Year");
        }
    }
}

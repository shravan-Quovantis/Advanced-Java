package com.company.lambdaexpression;

import java.util.Scanner;

interface ATM{                                  //ATM is shortcut so used capital letter
    public void currentBalance(int accountNumber);
}

public class LambdaExpressionDemo {
    public static void main(final String[] args) {

        final Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Your account number: ");
        final int accountNumber = scanner.nextInt();
        int accountBalance = 300;

        ATM atmA = new ATM() {
            @Override
            public void currentBalance(int accNumber) {
                System.out.println("Account Number: "+ accNumber) ;
                System.out.println("Your Current Account Balance: "+accountBalance);
            }
        };

        ATM atmB = accNumber -> {
            accNumber = 7854586;
            //accountBalance = 100;                                   //Class variable is final in lambda scope
            System.err.println("Account Number is manipulated: "+ accNumber) ;
        };

        atmA.currentBalance(accountNumber);
        atmB.currentBalance(accountNumber);
    }
}

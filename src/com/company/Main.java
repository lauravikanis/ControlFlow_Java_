package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 12;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 1) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was neither 1 or 2");
        }

        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was either 3,4 or 5");
                System.out.println("Actually it was " + switchValue);
                break; //code will be executed further if there is no "break"

            default:
                System.out.println("Value was different");
                break;
        }
        //Both archive the same thing but "switch" is shorter


        char testing = 'A';
        switch (testing) {
            case 'A':
                System.out.println("Its an A");
                break;
            case 'B':
                System.out.println("Its a B");
                break;
            case 'C':
                System.out.println("Its a C");
                break;
            case 'D':
                System.out.println("Its a D");
                break;
            case 'E':
                System.out.println("Its a E");
                break;
            default:
                System.out.println("Not found");
                System.out.println("Its an " + testing);
        }

        //System.out.println("10000 at 2% interest = " + calculateInterest(100000, 2.0));

        System.out.println("for-loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello");

        }

        System.out.println("Nummer erhöht sich");
        for (int i = 2; i < 9; i++) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(100000, i)));
            // "String.format("%.2f" -> 2 Nachkommastellen
        }

        System.out.println("Nummer wird kleiner");
        for (int i = 8; i > 1; i--) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(100000, i)));
            // "String.format("%.2f" -> 2 Nachkommastellen
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

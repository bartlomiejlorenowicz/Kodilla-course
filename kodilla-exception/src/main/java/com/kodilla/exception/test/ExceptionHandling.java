package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        double x = 2;
        double y = 1.5;

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            System.out.println("Something went wrong! " + e);
        }
        finally {
            System.out.println("Program is over");
        }
    }
}

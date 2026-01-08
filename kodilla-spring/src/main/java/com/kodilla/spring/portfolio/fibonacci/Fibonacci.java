package com.kodilla.spring.portfolio.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(new Fibonacci().fibonacci(10));
    }

    private int fibonacci(int n) {
        return n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}

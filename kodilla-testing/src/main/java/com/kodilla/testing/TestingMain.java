package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test OK!");
        } else  {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int addResult = calculator.add(1, 2);
        int subtractResult = calculator.subtract(4, 2);

        if (addResult == 3) {
            System.out.println("test OK!");
        } else  {
            System.out.println("Error!");
        }

        if (subtractResult == 2) {
            System.out.println("test OK!");
        } else  {
            System.out.println("Error!");
        }
    }
}

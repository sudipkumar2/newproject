package com.example.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Calculator Test Examples");
        System.out.println("=======================\n");
        
        // Test case 1: Positive numbers
        double a1 = 5.0;
        double b1 = 3.0;
        double c1 = Calculator.add(a1, b1);
        System.out.println("Test 1: " + a1 + " + " + b1 + " = " + c1);
        
        // Test case 2: Negative numbers
        double a2 = -10.0;
        double b2 = -5.0;
        double c2 = Calculator.add(a2, b2);
        System.out.println("Test 2: " + a2 + " + " + b2 + " = " + c2);
        
        // Test case 3: Mixed positive and negative
        double a3 = 15.5;
        double b3 = -7.5;
        double c3 = Calculator.add(a3, b3);
        System.out.println("Test 3: " + a3 + " + " + b3 + " = " + c3);
        
        // Test case 4: Decimal numbers
        double a4 = 3.14;
        double b4 = 2.86;
        double c4 = Calculator.add(a4, b4);
        System.out.println("Test 4: " + a4 + " + " + b4 + " = " + c4);
        
        // Test case 5: Zero
        double a5 = 0.0;
        double b5 = 100.0;
        double c5 = Calculator.add(a5, b5);
        System.out.println("Test 5: " + a5 + " + " + b5 + " = " + c5);
    }
}
package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator: a + b = c");
        System.out.println("============================");
        
        // Get input for 'a'
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        
        // Get input for 'b'
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();
        
        // Calculate c = a + b
        double c = add(a, b);
        
        // Display the result
        System.out.println("\nResult:");
        System.out.println(a + " + " + b + " = " + c);
        
        scanner.close();
    }
    
    /**
     * Adds two numbers and returns the result
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public static double add(double a, double b) {
        return a + b;
    }
}
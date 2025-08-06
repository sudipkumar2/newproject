import java.util.Scanner;

/**
 * Simple Calculator class that performs addition
 * Demonstrates a + b = c functionality
 */
public class Calculator {
    
    /**
     * Adds two numbers and returns the result
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Adds two double numbers and returns the result
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Calculator: a + b = c ===");
        System.out.println();
        
        // Example with predefined values
        int a1 = 5, b1 = 3;
        int c1 = add(a1, b1);
        System.out.println("Example 1 (integers): " + a1 + " + " + b1 + " = " + c1);
        
        double a2 = 2.5, b2 = 3.7;
        double c2 = add(a2, b2);
        System.out.println("Example 2 (decimals): " + a2 + " + " + b2 + " = " + c2);
        
        System.out.println();
        
        // Interactive input
        System.out.print("Enter first number (a): ");
        double userA = scanner.nextDouble();
        
        System.out.print("Enter second number (b): ");
        double userB = scanner.nextDouble();
        
        double userC = add(userA, userB);
        
        System.out.println();
        System.out.println("Result: " + userA + " + " + userB + " = " + userC);
        
        scanner.close();
    }
}
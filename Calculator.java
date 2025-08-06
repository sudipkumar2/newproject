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
     * Main method to demonstrate a + b = c
     */
    public static void main(String[] args) {
        // Example values
        int a = 5;
        int b = 3;
        int c = add(a, b);
        
        System.out.println("=== Simple Calculator: a + b = c ===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = a + b = " + a + " + " + b + " = " + c);
        System.out.println("Result: " + a + " + " + b + " = " + c);
        
        // Additional examples
        System.out.println("\n=== More Examples ===");
        int[] examples = {10, 20, 30, 40, 50};
        for (int i = 0; i < examples.length - 1; i++) {
            int num1 = examples[i];
            int num2 = examples[i + 1];
            int result = add(num1, num2);
            System.out.println(num1 + " + " + num2 + " = " + result);
        }
    }
}
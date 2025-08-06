import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number (a): ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number (b): ");
            double b = scanner.nextDouble();

            double c = a + b;
            System.out.println("a + b = " + c);
        } finally {
            scanner.close();
        }
    }
}
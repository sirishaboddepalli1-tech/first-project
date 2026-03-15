//simple caluculator in java
import java.util.Scanner;
public class Calculator {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            if (choice == 5) {
                running = false;
                System.out.println("Calculator closed.");
                break;
            }
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            switch (choice) {
                case 1 -> System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                case 2 -> System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                case 3 -> System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                case 4 -> {
                    double result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                }
                default -> System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}

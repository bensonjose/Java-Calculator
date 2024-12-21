import java.util.Scanner;

public class Main {  // Capitalized the class name
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c = 0.0;

        // Get input from user
        System.out.print("Enter the first number: \n");
        a = in.nextDouble();
        System.out.print("Enter the second number: \n");
        b = in.nextDouble();

        // Show operation options
        System.out.print("Choose the operation: " +
                "\n1. Addition" +
                "\n2. Subtraction" +
                "\n3. Multiplication" +
                "\n4. Division" +
                "\n5. Power" +
                "\nPlease enter the number of the operation: ");
        int operation = in.nextInt(); // Changed to int for simpler comparison

        switch (operation) {
            case 1: // Addition
                c = a + b;
                System.out.println(a + " + " + b + " = " + c);
                break;
            case 2: // Subtraction
                c = a - b;
                System.out.println(a + " - " + b + " = " + c);
                break;
            case 3: // Multiplication
                c = a * b;
                System.out.println(a + " * " + b + " = " + c);
                break;
            case 4: // Division
                if (b != 0) {  // Checking for division by zero
                    c = a / b;
                    System.out.println(a + " / " + b + " = " + c);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            case 5: // Power
                System.out.println("Enhance A or B?" +
                        "\n1. A" +
                        "\n2. B");
                int enhance = in.nextInt(); // Choice for power calculation
                if (enhance == 1) {
                    System.out.print("Enter the exponent: ");
                    double exponent = in.nextDouble();
                    System.out.println(a + " ^ " + exponent + " = " + Math.pow(a, exponent));
                } else if (enhance == 2) {
                    System.out.print("Enter the exponent: ");
                    double exponent = in.nextDouble();
                    System.out.println(b + " ^ " + exponent + " = " + Math.pow(b, exponent));
                } else {
                    System.out.println("Invalid choice for A or B.");
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }
    }
}

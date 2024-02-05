import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first number
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();

   git      // Read the second number
        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter the operation number (1-4): ");
        int operation = scanner.nextInt();

        // Perform the requested operation


    }
}
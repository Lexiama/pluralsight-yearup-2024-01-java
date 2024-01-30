public class MathApp {
    public static void main(String[] args) {
        // Alexia Mckoy
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        int bobSalary = 55000;
        int garySalary = 60000;

        // Use Math.max() to determine the highest salary
        int highestSalary = Math.max(bobSalary, garySalary);

        // Print the result
        System.out.println("Bob's salary: $" + bobSalary);
        System.out.println("Gary's salary: $" + garySalary);
        System.out.println("The highest salary is: $" + highestSalary);
        System.out.println("--------------------");

        //Question2

        int carPrice = 25000;
        int truckPrice = 30000;

        // Use Math.min() to determine the smallest price
        int smallestPrice = Math.min(carPrice, truckPrice);

        // Print the result
        System.out.println("Car price: $" + carPrice);
        System.out.println("Truck price: $" + truckPrice);
        System.out.println("The smallest price is: $" + smallestPrice);
        System.out.println("--------------------");

        // Question3
        // Calculate the area of the circle

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        // Print the result
        System.out.println("Radius of the circle: " + radius);
        System.out.println("Area of the circle: " + area);
        System.out.println("--------------------");

        // Question4
        //Calculate the square root
        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        // Print the result
        System.out.println("Original number: " + number);
        System.out.println("Square root: " + squareRoot);
        System.out.println("--------------------");

        //Question5
        System.out.println("--------------------");

        //Question6
        // Set the variable to -3.8
        double value = -3.8;

        // Calculate the absolute value
        double absoluteValue = Math.abs(value);

        // Print the result
        System.out.println("Original number: " + value);
        System.out.println("Absolute value: " + absoluteValue);
        System.out.println("--------------------");


        //Question7
        double randomNumber = Math.random();

        // Print the result
        System.out.println("Random number between 0 and 1: " + randomNumber);
        System.out.println("--------------------");

    }
}

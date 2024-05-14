package Week2Lab.Question5;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Area {

    private double length;
    private double breadth;

    // Constructor to initialize length and breadth
    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for input
            System.out.print("Enter length of the rectangle: ");
            double length = scanner.nextDouble();

            System.out.print("Enter breadth of the rectangle: ");
            double breadth = scanner.nextDouble();

            // Create object of Area class
            Area rectangle = new Area(length, breadth);

            // Calculate and print area
            double area = rectangle.returnArea();
            System.out.println("Area of the rectangle: " + area);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values for length and breadth.");
        } finally {
            scanner.close();
        }
    }
}


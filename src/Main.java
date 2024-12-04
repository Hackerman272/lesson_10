import customExceptions.IllegalTriangleException;
import geometry.Triangle;
import geometry.TriangleNew;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        System.out.println("Please, choose exercise:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int parsedNum = Integer.parseInt(input);

        if (parsedNum == 3) {
            task3();
        } else if (parsedNum == 4) {
            task4();
        }
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);

        double sideA = getNumericInput(scanner, "Side A: ");
        double sideB = getNumericInput(scanner, "Side B: ");
        double sideC = getNumericInput(scanner, "Side C: ");

        try {
            Triangle triangle = new Triangle(sideA, sideB, sideC);

            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());

        } catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void task4() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);

        double sideA = getNumericInput(scanner, "Side A: ");
        double sideB = getNumericInput(scanner, "Side B: ");
        double sideC = getNumericInput(scanner, "Side C: ");

        TriangleNew triangleNew = new TriangleNew(sideA, sideB, sideC);

        System.out.println("Area: " + triangleNew.getArea());
        System.out.println("Perimeter: " + triangleNew.getPerimeter());
    }

    private static double getNumericInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                double insertedValue = Double.parseDouble(input);
//                if (insertedValue <= 0) {
//                    System.out.println("Error: Not a valid number");
//                } else {
                    return insertedValue;
//                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric");
            }
        }
    }
}
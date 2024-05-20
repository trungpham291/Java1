package day7.example6;

import java.awt.*;
import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        createrMenu();
    }

    private static void createrMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter shape type to calculate.");
            System.out.println("1. Circle.");
            System.out.println("2. Square.");
            System.out.println("3. Triangle.");
            System.out.println("4. Rectangle.");
            System.out.println("0. Exit.");
            System.out.println("Please enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            ShapeUtility shapeUtility = null;
            switch (choice) {
                case 1:
                    shapeUtility = new Circle();
                    break;
                case 2:
                    shapeUtility = new Square();
                    break;
                case 3:
                    shapeUtility = new Triangle();
                    break;
                case 4:
                    shapeUtility = new Rectangle();
                    break;
                case 0:
                    System.out.println("Goodbye.");
                    break;
            }
            if (choice == 0){
                break;
            }
            if (shapeUtility != null){
                shapeUtility.inputData();
                double area = shapeUtility.calulateArea();
                double perimeter = shapeUtility.calulatePerimeter();
                System.out.println("Area: " + area);
                System.out.println("Perimeter: " + perimeter);
                System.out.println("Enter to continue: ");
                scanner.nextLine();
            }
        }
    }
}

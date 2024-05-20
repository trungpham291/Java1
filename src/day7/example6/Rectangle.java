package day7.example6;

import java.util.Scanner;

public class Rectangle implements ShapeUtility{
    Scanner scanner = new Scanner(System.in);
    private double a;
    private double b;


    @Override
    public void inputData() {
        System.out.println("Please enter the 2 edges of rectangle.");
        System.out.println("Enter 1 edge: ");
        this.a=scanner.nextDouble();
        System.out.println("Enter 2 edge: ");
        this.b=scanner.nextDouble();

    }

    @Override
    public double calulateArea() {
        return a * b;
    }

    @Override
    public double calulatePerimeter() {
        return (a + b) * 2;
    }
}

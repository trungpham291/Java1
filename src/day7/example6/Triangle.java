package day7.example6;

import java.util.Scanner;

public class Triangle implements ShapeUtility{
    private double a;
    private double b;
    private double c;
    Scanner sc = new Scanner(System.in);

    @Override
    public void inputData() {
        System.out.println("Please enter 1 number: ");
        a = sc.nextDouble();
        System.out.println("Please enter 2 edge: ");
        b = sc.nextDouble();
        System.out.println("Please enter 3 edge: ");
        c = sc.nextDouble();
    }

    @Override
    public double calulateArea() {
        double s = calulatePerimeter()/ 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calulatePerimeter() {
        return  a + b + c;
    }
}

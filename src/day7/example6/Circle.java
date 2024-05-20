package day7.example6;

import java.util.Scanner;

public class Circle  implements ShapeUtility{

    private double radius;

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        this.radius= scanner.nextDouble();

    }

    @Override
    public double calulateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double calulatePerimeter() {
        return radius * 2 * Math.PI;
    }
}

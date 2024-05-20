package day7.example6;

import java.util.Scanner;

public class Square implements ShapeUtility {
    private double a;
    Scanner scanner = new Scanner(System.in);
    @Override
    public void inputData() {
        System.out.println("Vui long nhap canh hinh vuong: ");
        this.a = scanner.nextDouble();

    }

    @Override
    public double calulateArea() {
        return a*a;
    }

    @Override
    public double calulatePerimeter() {
        return a* 4;
    }
}


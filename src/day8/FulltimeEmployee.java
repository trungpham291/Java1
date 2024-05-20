package day8;

import java.util.Scanner;

public class FulltimeEmployee implements SalaryCalculator{
    Scanner scanner = new Scanner(System.in);
    private double a;

    @Override
    public void inputSalary() {
        System.out.println("Enter the number of days worked: ");
        a = scanner.nextDouble();

    }

    @Override
    public double calculateSalary() {
        return a * 100;
    }
}

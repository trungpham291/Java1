package day8;

import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {
        createrMenu();
    }
    public static void createrMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the type to calculate. ");
            System.out.println("1. FullTime.");
            System.out.println("2. PartTime.");
            System.out.println("0. Exit.");
            System.out.println("Please enter your choice (1-2): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            SalaryCalculator salaryCalculator = null;
            switch (choice) {
                case 1:
                    salaryCalculator = new FulltimeEmployee();
                    break;
                case 2:
                    salaryCalculator = new PartimeEmployee();
                    break;
                case 0:
                    System.out.println("Goodbye.");
                    break;
            }
            if (choice == 0){
                break;
            }
            if (salaryCalculator != null) {
                salaryCalculator.inputSalary();
                double salary = salaryCalculator.calculateSalary();
                System.out.println("Your salary : " + salary);
                System.out.println("Enter to continue");
                scanner.nextLine();
            }
        }
    }
}

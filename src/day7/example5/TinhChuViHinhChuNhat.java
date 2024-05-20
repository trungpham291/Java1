package day7.example5;

import java.util.Scanner;

public class TinhChuViHinhChuNhat implements TinhChuVi{
    @Override
    public double tinhToan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double b = scanner.nextDouble();
        return (a + b) * 2;
    }
}

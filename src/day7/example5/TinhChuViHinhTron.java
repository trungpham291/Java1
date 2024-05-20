package day7.example5;

import java.util.Scanner;

public class TinhChuViHinhTron implements TinhChuVi{
    @Override
    public double tinhToan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ban Kinh: ");
        double a = sc.nextDouble();
        return 2*a*3.14;
    }
}

package day7.example5;

import java.util.Scanner;

public class TinhChuViTamGiac implements TinhChuVi{

    @Override
    public double tinhToan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh 1 cua tam giac: ");
        double a = sc.nextDouble();
        System.out.println("Nhap canh 2 cua tam giac: ");
        double b = sc.nextDouble();
        System.out.println("Nhap canh 3 cua tam giac: ");
        double c = sc.nextDouble();
        return a + b + c;
    }
}

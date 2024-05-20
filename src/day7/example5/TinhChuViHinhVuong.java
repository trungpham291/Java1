package day7.example5;

import java.util.Scanner;

public class TinhChuViHinhVuong implements TinhChuVi {


// viet thu do
    @Override
    public double tinhToan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui Long nhap 1 canh hinh vuong: ");
        double a = scanner.nextDouble();
        return a * 4;
    }
}

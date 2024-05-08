package util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương Trình Máy Tính : ");
        System.out.println("========================");
        System.out.println("1. Tính tổng 2 số ");
        System.out.println("2. Tính hiệu 2 số ");
        System.out.println("3. Tính nhân 2 số ");
        System.out.println("4. Tính chia 2 số ");
        System.out.println("========================");
        System.out.println("Vui Long lua chon (1-4): ");
        int  choice= sc.nextInt();
        float number1= 0;
        float number2= 0;
        float result= 0;
        switch (choice) {
            case 1:
                System.out.println("Tong hai so la: ");
                result = Calculator.tinhTongHaiSo(number1, number2);
                break;
            case 2:
                System.out.println("Hieu hai so la: ");
                result = Calculator.tinhHieuHaiSo(number1, number2);
                break;
            case 3 :
                System.out.println("Tich 2 so: " );
                result = Calculator.tinhNhanHaiSo(number1 , number2);
                break;
            case 4 :
               result = Calculator.tinhChiaHaiSo(number1, number2);
               if (result != 0) {
                   System.out.println("Thuong 2 so: ");
               }
               break;
            
        }






//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Chương Trình Tính Chu Vi tam giác: ");
//        System.out.println("Vui Lòng nhập độ dài cạnh thứ nhất : ");
//        float a = scanner.nextFloat();
//        System.out.println("Vui Lòng nhập độ dài cạnh thứ hai : ");
//        float b = scanner.nextFloat();
//        System.out.println("Vui Lòng nhập độ dài cạnh thứ ba : ");
//        float c = scanner.nextFloat();
//        float chuvi = Calculator.tinhChuViTamGiac(a, b, c);
//        System.out.println("Chu Vi tam Giac: ");
//        System.out.println(chuvi);




    }
}

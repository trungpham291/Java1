package util;

public class Calculator {
    public static float tinhChuViTamGiac(float a, float b, float c) {
        return a + b + c;


    }
    public static float tinhTongHaiSo(float a, float b) {
        return a + b;
    }
    public static float tinhHieuHaiSo(float a, float b) {
        return a - b;
    }
    public static float tinhNhanHaiSo(float a, float b) {
        return a * b;
    }
    public static float tinhChiaHaiSo(float a, float b) {
        if (b==0){
            System.out.println("Khong the chia cho 0");
            return 0;
        }

        return a / b;
    }
}



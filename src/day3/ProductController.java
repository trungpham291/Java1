package aptech.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    ArrayList<aptech.day3.Product> productsArrayList = new ArrayList<>();

//1. Cho phep  nhap san pham

    public void createProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name: ");
        aptech.day3.Product product1 = new aptech.day3.Product();
        System.out.println("Nhap Id: ");
        product1.id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Nhap slug cho san pham : ");
        product1.slug = scanner.nextLine();
        System.out.println("Nhap ten cho san pham : ");
        product1.name = scanner.nextLine();
        System.out.println("Nhap gia cho san pham : ");
        product1.price = scanner.nextDouble();

        productsArrayList.add(product1);
        System.out.println("Luu Du Lieu Thanh Cong : ");


    }
    public void showListProduct() {
        for (int i = 0; i < productsArrayList.size(); i++) {
            aptech.day3.Product p1 = productsArrayList.get(i);
            System.out.println(p1.id);
            System.out.println(p1.slug);
            System.out.println(p1.name);
            System.out.println(p1.price);

        }
    }

}

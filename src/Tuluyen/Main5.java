package Tuluyen;

import day5.CustomerController;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        createMenu();

    }

    public static void createMenu() {
        Scanner sc = new Scanner(System.in);
        CustomerController customerController = new CustomerController();
        while (true){
            System.out.println("Chuong trinh quan ly khach hang.");
            System.out.println("===================================");
            System.out.println("1. Them moi khach hang.");
            System.out.println("2. Hien thi danh sach khach hang.");
            System.out.println("3. Sua thong tin khach hang.");
            System.out.println("4. Xoa khach hang.");
            System.out.println("5. Thoat chuong trinh.");
            System.out.println("===================================");
            System.out.println("Vui Long nhap Lua Chon: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    customerController.creater();
                    break;
                case 2:
                    customerController.showListCustomer();
                    break;
                case 3:
                    System.out.println("Chuc Nang dang duoc phat trien");
                    break;
                case 4:
                    System.out.println("Chuc Nang dang duoc phat trien");
                    break;
                case 5:
                    System.out.println("Tam biet, hen gap lai.");
                    break;
                default:
                    System.out.println("Vui long lua chon tu 1 den 5");
                    break;
            }
            if (choice == 5) {
//                Ket thuc chuong trinh
                break;
            }
        }
    }
}

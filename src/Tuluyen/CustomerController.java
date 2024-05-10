package Tuluyen;


import day5.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {
    ArrayList<day5.Customer> customers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    //    1.Cho phep tao moi thong tin khach hang
    public void creater(){
        Scanner scanner = new Scanner(System.in);
//  Yeu Cau Nhap
        System.out.println("Vui long nhap thong tin khach hang.");
        System.out.println("Nhap id; ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Nhap Ten: ");
        String firstName = scanner.nextLine();
        System.out.println("Nhap Ho: ");
        String lastName = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        System.out.println("Nhap adress: ");
        String address = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine();

//         Tao ra mot doi tuong customer tu thong tin nhap vao
        day5.Customer customer = new day5.Customer();
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLastname(lastName);
        customer.setEmail(email);
        customer.setPhone(phone);
        customer.setAddress(address);
        customer.setAge(age);

//        Dua customer va list
        customers.add(customer);

    }
    //    2.Cho phep hien thi
    public void showListCustomer(){
        System.out.println("Hien thi danh sach khach hang");
        System.out.println("--------------------------------------");
        System.out.printf("%-10s || %-30s || %-30s\n", "Id", "Last Name", "First Name");
        System.out.println("======================================================================");
        for(int i=0; i<customers.size(); i++){
            Customer c = customers.get(i);
            System.out.printf("%-10s || %-30s || %-30s\n", c.getId(), c.getFirstName(), c.getLastname());
        }
        System.out.println("Enter de tiep tuc");
        scanner.nextLine();
    }
}

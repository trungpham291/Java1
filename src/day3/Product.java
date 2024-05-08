package aptech.day3;

public class Product {
        long id;
        String name;
        String slug;
        double price;

    void showInformation(){
        System.out.println("Thong tin san pham. ");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Slug: " + slug);
        System.out.printf("Price: " + price);
    }

}


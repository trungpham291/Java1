package day7.example2;
//           Con             Cha,me
public class Product extends BaseEntity{
    private double price;

    public Product() {
        super();
//       gọi constructor của thằng cha
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

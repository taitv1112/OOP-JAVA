package Giat_Thuat.JavaColection.Product;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;
    static int idNumber=1;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Product(String name, int quantity, double price) {
        this.id = idNumber++;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public void setAll(String name, int quantity, double price){
        this.id = idNumber++;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


}

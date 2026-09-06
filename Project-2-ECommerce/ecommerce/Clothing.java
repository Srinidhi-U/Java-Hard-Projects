package ecommerce;

public class Clothing extends Product {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public void sizeInfo() {
        System.out.println("Available sizes: S, M, L, XL");
    }
}

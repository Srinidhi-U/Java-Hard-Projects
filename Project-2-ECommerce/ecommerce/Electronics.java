package ecommerce;

public class Electronics extends Product {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public void warranty() {
        System.out.println("1 year warranty available");
    }
}

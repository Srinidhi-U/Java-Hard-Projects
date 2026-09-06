package ecommerce;

public class Laptop extends Electronics {
    public Laptop(int id, String name, double price) {
        super(id, name, price);
    }

    public void specs() {
        System.out.println("Laptop: 16GB RAM, 512GB SSD");
    }
}

package ecommerce;

public class Clothing extends Product {
    private String size;

    public void setSize(String size) {
        this.size = size;
    }

    public void displayClothingDetails() {
        System.out.println("Size: " + size);
    }
}
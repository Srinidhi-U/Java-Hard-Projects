package ecommerce;

public class Electronics extends Product {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void displayElectronicsDetails() {
        System.out.println("Brand: " + brand);
    }
}
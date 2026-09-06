package ecommerce;

public class ShoppingDemo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setProductName("Dell Laptop");
        laptop.setPrice(60000);
        laptop.setBrand("Dell");
        laptop.setRam(16);

        Clothing clothing = new Clothing();
        clothing.setProductName("Formal Shirt");
        clothing.setPrice(1500);
        clothing.setSize("L");

        laptop.displayProductDetails();
        laptop.displayElectronicsDetails();
        laptop.displayLaptopDetails();

        System.out.println();

        clothing.displayProductDetails();
        clothing.displayClothingDetails();
    }
}
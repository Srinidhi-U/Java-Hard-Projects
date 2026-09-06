package ecommerce;

public class ShoppingDemo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(101, "Lenovo Laptop", 60000);
        laptop.display();
        laptop.warranty();
        laptop.specs();

        Clothing shirt = new Clothing(102, "Formal Shirt", 1500);
        shirt.display();
        shirt.sizeInfo();

        Payment payment = new UPIPayment();
        payment.pay(laptop.getPrice());
    }
}

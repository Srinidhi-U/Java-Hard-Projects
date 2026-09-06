package ecommerce;

import java.util.Scanner;

public class ShoppingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop laptop = new Laptop(101, "Lenovo Laptop", 60000);
        Clothing shirt = new Clothing(102, "Formal Shirt", 1500);
        int choice;

        do {
            System.out.println("\n--- E-COMMERCE SYSTEM ---");
            System.out.println("1. View Laptop");
            System.out.println("2. View Clothing");
            System.out.println("3. Buy Laptop with UPI");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    laptop.display();
                    laptop.warranty();
                    laptop.specs();
                    break;
                case 2:
                    shirt.display();
                    shirt.sizeInfo();
                    break;
                case 3:
                    Payment payment = new UPIPayment();
                    payment.pay(laptop.getPrice());
                    break;
                case 0:
                    System.out.println("Thank you for shopping.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);

        sc.close();
    }
}

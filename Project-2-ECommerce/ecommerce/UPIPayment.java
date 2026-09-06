package ecommerce;

public class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

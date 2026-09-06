package ecommerce;

public class Mobile extends Electronics {
    public Mobile(int id, String name, double price) {
        super(id, name, price);
    }

    public void simType() {
        System.out.println("Supports 5G SIM");
    }
}

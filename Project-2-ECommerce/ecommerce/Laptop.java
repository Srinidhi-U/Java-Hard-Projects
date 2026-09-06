package ecommerce;

public class Laptop extends Electronics {
    private int ram;

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void displayLaptopDetails() {
        System.out.println("RAM: " + ram + " GB");
    }
}
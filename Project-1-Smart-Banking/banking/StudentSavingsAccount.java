package banking;

public class StudentSavingsAccount extends SavingsAccount {
    private double discount;

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void displayStudentSavingsDetails() {
        System.out.println("Student Discount: " + discount + "%");
    }
}
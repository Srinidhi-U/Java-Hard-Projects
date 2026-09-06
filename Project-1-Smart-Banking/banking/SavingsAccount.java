package banking;

public class SavingsAccount extends Account {
    private double interestRate;

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
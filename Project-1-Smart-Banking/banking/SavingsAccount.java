package banking;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String name, int accountNumber, double balance, double interestRate) {
        super(name, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

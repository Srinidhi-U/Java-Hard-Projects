package banking;

public class CurrentAccount extends Account {
    private double minimumBalance;

    public CurrentAccount(String name, int accountNumber, double balance, double minimumBalance) {
        super(name, accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Minimum balance must be maintained");
        }
    }
}

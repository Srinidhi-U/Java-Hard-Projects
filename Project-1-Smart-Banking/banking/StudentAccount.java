package banking;

public class StudentAccount extends SavingsAccount {
    private double bonus;

    public StudentAccount(String name, int accountNumber, double balance, double interestRate, double bonus) {
        super(name, accountNumber, balance, interestRate);
        this.bonus = bonus;
    }

    public void addStudentBonus() {
        deposit(bonus);
        System.out.println("Student bonus added: " + bonus);
    }
}

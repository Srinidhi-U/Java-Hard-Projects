package banking;

public class BankDemo {
    public static void main(String[] args) {
        StudentSavingsAccount account = new StudentSavingsAccount();

        account.setAccountHolder("Srinidhi");
        account.setBalance(10000);
        account.setInterestRate(5.5);
        account.setDiscount(10);

        account.displayAccountDetails();
        account.displaySavingsDetails();
        account.displayStudentSavingsDetails();
    }
}
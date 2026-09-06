package banking;

public class BankDemo {
    public static void main(String[] args) {
        StudentAccount student = new StudentAccount("Srinidhi", 101, 5000, 5, 500);
        student.deposit(1000);
        student.addInterest();
        student.addStudentBonus();
        student.display();

        System.out.println("\nCurrent Account");
        CurrentAccount current = new CurrentAccount("Rahul", 102, 10000, 2000);
        current.withdraw(3000);
        current.display();
    }
}

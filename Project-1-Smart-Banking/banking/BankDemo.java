package banking;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter opening balance: ");
        double balance = sc.nextDouble();

        StudentAccount account = new StudentAccount(name, 101, balance, 5, 500);
        int choice;

        do {
            System.out.println("\n--- SMART BANKING ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Add Interest");
            System.out.println("4. Student Bonus");
            System.out.println("5. Display Account");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Amount: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Amount: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.addInterest();
                    break;
                case 4:
                    account.addStudentBonus();
                    break;
                case 5:
                    account.display();
                    break;
                case 0:
                    System.out.println("Thank you for using Smart Banking.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);

        sc.close();
    }
}

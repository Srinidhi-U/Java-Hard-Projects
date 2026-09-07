import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String details = sc.nextLine();

        String[] data = details.split(",");

        String stageEvent = data[0];
        String customer = data[1];
        Integer noOfSeats = Integer.parseInt(data[2]);

        TicketBooking t = new TicketBooking(stageEvent, customer, noOfSeats);

        int choice = sc.nextInt();

        if (choice == 1) {
            Double amount = sc.nextDouble();
            t.makePayment(amount);

        } else if (choice == 2) {
            Double amount = sc.nextDouble();
            String walletNumber = sc.next();
            t.makePayment(walletNumber, amount);

        } else if (choice == 3) {
            String name = sc.next();
            Double amount = sc.nextDouble();
            String creditCard = sc.next();
            String ccv = sc.next();
            t.makePayment(creditCard, ccv, name, amount);

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}

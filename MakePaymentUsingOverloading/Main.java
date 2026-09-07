import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] data = sc.nextLine().split(",");
        TicketBooking t = new TicketBooking(
            data[0], data[1], Integer.parseInt(data[2]));

        int choice = sc.nextInt();

        if (choice == 1) {
            t.makePayment(sc.nextDouble());
        } else if (choice == 2) {
            Double amount = sc.nextDouble();
            String wallet = sc.next();
            t.makePayment(wallet, amount);
        } else if (choice == 3) {
            String name = sc.next();
            Double amount = sc.nextDouble();
            String card = sc.next();
            String ccv = sc.next();
            t.makePayment(card, ccv, name, amount);
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
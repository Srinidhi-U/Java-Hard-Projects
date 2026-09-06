package hospital;

import java.util.Scanner;

public class HospitalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpecialistDoctor doctor = new SpecialistDoctor("Dr. Anil", 45, 800, "Cardiology");
        Patient patient = new Patient("Ravi", 22, "Chest pain");
        Hospital hospital = new Hospital();
        int choice;

        do {
            System.out.println("\n--- SMART HOSPITAL ---");
            System.out.println("1. Doctor Details");
            System.out.println("2. Patient Details");
            System.out.println("3. Book Appointment");
            System.out.println("4. Pay Bill");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    doctor.display();
                    break;
                case 2:
                    patient.display();
                    break;
                case 3:
                    hospital.bookAppointment(patient.getName());
                    break;
                case 4:
                    hospital.payBill(doctor.getConsultationFee());
                    break;
                case 0:
                    System.out.println("Thank you for using Smart Hospital.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);

        sc.close();
    }
}

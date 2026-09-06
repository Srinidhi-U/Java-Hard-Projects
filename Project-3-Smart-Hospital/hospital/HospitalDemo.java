package hospital;

public class HospitalDemo {
    public static void main(String[] args) {
        SpecialistDoctor doctor = new SpecialistDoctor("Dr. Anil", 45, 800, "Cardiology");
        Patient patient = new Patient("Ravi", 22, "Chest pain");

        System.out.println("DOCTOR");
        doctor.display();

        System.out.println("\nPATIENT");
        patient.display();

        Hospital hospital = new Hospital();
        hospital.bookAppointment(patient.getName());
        hospital.payBill(800);
    }
}

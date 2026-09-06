package hospital;

public class Hospital implements Payable, Schedulable {
    @Override
    public void payBill(double amount) {
        System.out.println("Bill paid: Rs." + amount);
    }

    @Override
    public void bookAppointment(String patientName) {
        System.out.println("Appointment booked for " + patientName);
    }
}

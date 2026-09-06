package hospital;

public class Doctor extends Person {
    private double consultationFee;

    public Doctor(String name, int age, double consultationFee) {
        super(name, age);
        this.consultationFee = consultationFee;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Consultation Fee: Rs." + consultationFee);
    }
}

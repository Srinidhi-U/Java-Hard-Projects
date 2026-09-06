package hospital;

public class SpecialistDoctor extends Doctor {
    private String specialization;

    public SpecialistDoctor(String name, int age, double consultationFee, String specialization) {
        super(name, age, consultationFee);
        this.specialization = specialization;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
    }
}

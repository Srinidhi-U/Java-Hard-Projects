package hospital;

public class Doctor extends Staff {
    private String specialization;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void displayDoctorDetails() {
        System.out.println("Specialization: " + specialization);
    }
}
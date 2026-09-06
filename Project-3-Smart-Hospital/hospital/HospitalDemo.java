package hospital;

public class HospitalDemo {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setName("Dr. Anil");
        doctor.setStaffId(101);
        doctor.setSpecialization("Cardiology");

        Nurse nurse = new Nurse();
        nurse.setName("Anitha");
        nurse.setStaffId(102);
        nurse.setWard("Emergency Ward");

        doctor.displayStaffDetails();
        doctor.displayDoctorDetails();

        System.out.println();

        nurse.displayStaffDetails();
        nurse.displayNurseDetails();
    }
}
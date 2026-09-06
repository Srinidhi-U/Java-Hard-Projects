package hospital;

public class Nurse extends Staff {
    private String ward;

    public void setWard(String ward) {
        this.ward = ward;
    }

    public void displayNurseDetails() {
        System.out.println("Ward: " + ward);
    }
}
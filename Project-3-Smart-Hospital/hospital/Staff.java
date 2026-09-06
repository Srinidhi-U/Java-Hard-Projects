package hospital;

public class Staff {
    private String name;
    private int staffId;

    public void setName(String name) {
        this.name = name;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public void displayStaffDetails() {
        System.out.println("Name: " + name);
        System.out.println("Staff ID: " + staffId);
    }
}
package hospital;

public class Patient extends Person {
    private String problem;

    public Patient(String name, int age, String problem) {
        super(name, age);
        this.problem = problem;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Problem: " + problem);
    }
}

package va.CC;

public class Clerk extends Person {

    private double workingHours;

    public Clerk(String firstName, String lastName, int age, double workingHours) {
        super(firstName, lastName, age);
        this.workingHours = workingHours;
    }
}

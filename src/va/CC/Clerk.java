package va.CC;

public class Clerk extends Person {

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    private double workingHours;
    private double wage;

    public Clerk(String firstName, String lastName, int age, double workingHours) {
        super(firstName, lastName, age);
        this.workingHours = workingHours;
        this.wage = 0;
    }
}

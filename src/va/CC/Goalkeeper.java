package va.CC;

public class Goalkeeper extends Footballer {

    private double goalKeepingSkill;
    private double minGoalKeepingSkill = 1;
    private double maxGoalKeepingSkill = 100;
    private double savedGoalsPerGame;

    public double getGoalKeepingSkill() {
        return goalKeepingSkill;
    }

    public void setGoalKeepingSkill(double goalKeepingSkill) {
        this.goalKeepingSkill = goalKeepingSkill;
    }

    public Goalkeeper(String firstName, String lastName, int age, SPORTTYPE sporttype, int playerNumber, double salary) {
        super(firstName, lastName, age, sporttype, playerNumber, salary);
        this.goalKeepingSkill = calculateGoalKeepingSkill();
    }

    public double calculateGoalKeepingSkill() {
        double goalKeepingSkill = (Math.random() * (maxGoalKeepingSkill - minGoalKeepingSkill)) + minGoalKeepingSkill;
        return goalKeepingSkill;
    }
}

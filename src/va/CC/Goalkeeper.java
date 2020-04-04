package va.CC;

public class Goalkeeper extends Footballer {

    private double goalKeepingSkill;
    private double minGoalKeepingSkill = 1;
    private double maxGoalKeepingSkill = 100;
    private double savedGoalsPerGame;

    public Goalkeeper(String firstName, String lastName, int age, SPORTTYPE sporttype, double skill, int playerNumber, double salary) {
        super(firstName, lastName, age, sporttype, skill, playerNumber, salary);
        this.goalKeepingSkill = calculateGoalKeepingSkill();
    }

    public double calculateGoalKeepingSkill() {
        double goalKeepingSkill = (Math.random() * (maxGoalKeepingSkill - minGoalKeepingSkill)) + minGoalKeepingSkill;
        return goalKeepingSkill;
    }
}

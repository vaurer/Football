package va.CC;

public class Goalkeeper extends Footballer {

    private double playerHigh;
    private double savedGoalsPerGame;

    public Goalkeeper(String firstName, String lastName, int age, SPORTTYPE sporttype, double skill, int playerNumber, double salary) {
        super(firstName, lastName, age, sporttype, skill, playerNumber, salary);
    }

    public double keepTheGoal() {
        double keepTheGoal = (playerHigh / 100) + (getSkill() / 1000);
        return keepTheGoal;

    }
}

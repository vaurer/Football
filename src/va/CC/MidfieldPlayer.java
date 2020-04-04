package va.CC;

public class MidfieldPlayer extends Footballer {
    private double passingBall;
    private final double maxpassingBall = 100;
    private final double minpassingBall = 1;
    private double goalsPerGame;

    public MidfieldPlayer(String firstName, String lastName, int age, SPORTTYPE sporttype, int playerNumber, double salary) {
        super(firstName, lastName, age, sporttype, playerNumber, salary);
        this.passingBall = calculatePassingBallSkill();
    }

    private double calculatePassingBallSkill() {
        double passingBall = (Math.random() * (maxpassingBall - minpassingBall)) + minpassingBall;
        return passingBall;
    }
}

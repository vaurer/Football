package va.CC;

public class Striker extends Footballer {

    private double speed;
    private final double maxSpeed = 100;
    private final double minSpeed = 1;
    private double goalsPerGame;

    public Striker(String firstName, String lastName, int age, SPORTTYPE sporttype, int playerNumber, double salary, double goalsPerGame) {
        super(firstName, lastName, age, sporttype, playerNumber, salary);
        this.speed = calculateSpeed();
        this.goalsPerGame = goalsPerGame;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getGoalsPerGame() {
        return goalsPerGame;
    }

    public void setGoalsPerGame(double goalsPerGame) {
        this.goalsPerGame = goalsPerGame;
    }

    private double calculateSpeed(){
        double speed = (Math.random() * (maxSpeed - minSpeed)) + minSpeed;
        return speed;
    }

}

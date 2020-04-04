package va.CC;

public class Striker extends Footballer {

    private double speed;
    private double goalsPerGame;

    public Striker(String firstName, String lastName, int age, SPORTTYPE sporttype, double skill, int playerNumber, double salary, double speed, double goalsPerGame) {
        super(firstName, lastName, age, sporttype, skill, playerNumber, salary);
        this.speed = speed;
        this.goalsPerGame = goalsPerGame;
    }

}

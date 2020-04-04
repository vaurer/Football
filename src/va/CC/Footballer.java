package va.CC;

public class Footballer extends SportPerson {
    private int playerNumber;
    private double salary;

    public Footballer(String firstName, String lastName, int age, SPORTTYPE sporttype, int playerNumber, double salary) {
        super(firstName, lastName, age, sporttype);
        this.playerNumber = assignNumber();
        this.salary = salary;

    }

    public double playFootball(){
        getPaid();
        return getSkill();
    }

    public double getPaid(){
        return salary;
    }

    private int assignNumber(){
        playerNumber=0;
        return playerNumber;
    }
}

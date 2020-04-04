package va.CC;

public class Footballer extends sportPerson{
    private int playerNumber = 0;
    private double salary;

    public Footballer(String firstName, String lastName, int age, SPORTTYPE sporttype, double skill, int playerNumber, double salary) {
        super(firstName, lastName, age, sporttype, skill);
        this.playerNumber = playerNumber;
        this.salary = salary;
    }

    public double playFootball(){
        getPaid();
        return getSkill();
    }

    public double getPaid(){
        return salary;
    }

}

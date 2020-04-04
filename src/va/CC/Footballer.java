package va.CC;

public class Footballer extends SportPerson {

    private int playerNumber;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

    public Footballer(String firstName, String lastName, int age, SPORTTYPE sporttype, int playerNumber, double salary) {
        super(firstName, lastName, age, sporttype);
        this.playerNumber = assignNumber();
        this.salary = salary;

    }
    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
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

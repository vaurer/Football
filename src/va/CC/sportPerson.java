package va.CC;

public class sportPerson extends Person {

     enum SPORTTYPE {INDIVIDUAL, TEAM}

    private SPORTTYPE sporttype;
    private double skill = 0;
    private double minSkill = 1;
    private double maxSkill = 100;

    public sportPerson(String firstName, String lastName, int age, SPORTTYPE sporttype) {
        super(firstName, lastName, age);
        this.sporttype = sporttype;
        this.skill = calculateSkill();
    }

    public SPORTTYPE getSporttype() {
        return sporttype;
    }

    public void setSporttype(SPORTTYPE sporttype) {
        this.sporttype = sporttype;
    }

    public double getSkill() {
        return skill;
    }

    public void setSkill(double skill) {
        this.skill = skill;
    }

    public double doTraining(double repeats) {
        double temp = 0;
        for (int i = 0; i < repeats; i++) {
            temp++;
        }
        skill = skill + temp;
        return skill;
    }

    public double calculateSkill() {
        double skill = (Math.random() * (maxSkill - minSkill)) + minSkill;
        return skill;
    }
}


package va.CC;

public class sportPerson extends Person {

     enum SPORTTYPE {INDIVIDUAL, TEAM}

    private SPORTTYPE sporttype;
    private double skill = 0;

    public sportPerson(String firstName, String lastName, int age, SPORTTYPE sporttype, double skill) {
        super(firstName, lastName, age);
        this.sporttype = sporttype;
        this.skill = skill;
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
}


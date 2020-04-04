package va.CC;

public class Main {

    public static void main(String[] args) {

        Striker striker1 = new Striker("Roberto", "Baggio", 20, sportPerson.SPORTTYPE.TEAM, 0, 0,0);
        System.out.println(striker1.getSpeed());
        System.out.println(striker1.getSkill());
        System.out.println(striker1.getSpeed()+striker1.getSkill()+"\n");

        Goalkeeper goalkeeper1 = new Goalkeeper("Vedran", "Aurer", 41, sportPerson.SPORTTYPE.TEAM, 0, 0);
        System.out.println(goalkeeper1.getGoalKeepingSkill());
        System.out.println(goalkeeper1.getSkill());
        System.out.println(goalkeeper1.getGoalKeepingSkill()+goalkeeper1.getSkill());

    }
}

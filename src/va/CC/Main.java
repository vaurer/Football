package va.CC;

public class Main {

    public static void main(String[] args) {

        Striker striker1 = new Striker("Roberto", "Baggio", 20, SportPerson.SPORTTYPE.TEAM, 0, 0, 0);
        System.out.println(striker1.getSpeed());
        System.out.println(striker1.getSkill());
        System.out.println(striker1.getSpeed() + striker1.getSkill() + "\n");

        Goalkeeper goalkeeper1 = new Goalkeeper("Vedran", "Aurer", 41, SportPerson.SPORTTYPE.TEAM, 0, 0);
        System.out.println(goalkeeper1.getGoalKeepingSkill());
        System.out.println(goalkeeper1.getSkill());
        System.out.println(goalkeeper1.getGoalKeepingSkill() + goalkeeper1.getSkill());

        MidfieldPlayer midfieldPlayer1 = new MidfieldPlayer("Luka", "Modric", 25, SportPerson.SPORTTYPE.TEAM, 0, 0);

        Clerk clerk1 = new Clerk("Max", "Mustermann", 35, 41.5);

        FootballClub footballClub1 = new FootballClub("Dinamo", "Maksimirska 1", 5000000);
        //System.out.println(footballClub1.getName());
        footballClub1.assignPlayer(striker1);
        footballClub1.assignPlayer(goalkeeper1);
        footballClub1.assignPlayer(midfieldPlayer1);

        footballClub1.playerList();
        System.out.println(goalkeeper1.getSalary());
        System.out.println(goalkeeper1.getSkill());
        goalkeeper1.doTraining(5);
        System.out.println(goalkeeper1.getSkill());
    }
}

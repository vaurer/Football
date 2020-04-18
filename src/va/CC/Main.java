package va.CC;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Striker striker1 = new Striker("Roberto", "Baggio", 20, SportPerson.SPORTTYPE.TEAM, 0, 0, 0);
//        System.out.println(striker1.getSpeed());
//        System.out.println(striker1.getSkill());
//        System.out.println(striker1.getSpeed() + striker1.getSkill() + "\n");

        Goalkeeper goalkeeper1 = new Goalkeeper("Vedran", "Aurer", 41, SportPerson.SPORTTYPE.TEAM, 0, 0);
//        System.out.println(goalkeeper1.getGoalKeepingSkill());
//        System.out.println(goalkeeper1.getSkill());
//        System.out.println(goalkeeper1.getGoalKeepingSkill() + goalkeeper1.getSkill());

        MidfieldPlayer midfieldPlayer1 = new MidfieldPlayer("Luka", "Modric", 25, SportPerson.SPORTTYPE.TEAM, 0, 0);

        FootballClub footballClub1 = new FootballClub("Dinamo", "Maksimirska 1", 5000000, 200);
        //System.out.println(footballClub1.getName());
        footballClub1.assignPlayer(striker1);
        footballClub1.assignPlayer(goalkeeper1);
        footballClub1.assignPlayer(midfieldPlayer1);

        footballClub1.playerList();
        System.out.println("Goalkeeper skill: " + goalkeeper1.getSkill());
        goalkeeper1.doTraining(5);
        System.out.println("Goalkeeper skill after training: " +goalkeeper1.getSkill());

        Management management1 = new Management("Maxy", "Muster", 45, 10);
        footballClub1.assignManagement(management1);
        System.out.println("membership fee: " + footballClub1.getMembershipFee());
        footballClub1.setMembershipFee(management1.membershipFeeDecision());
        System.out.println("membership fee after management decision: " + footballClub1.getMembershipFee());

        ClubMembers clubMembers1 = new ClubMembers("Andy", "Warth", 22);
        System.out.println("club budget: " + footballClub1.getBudget());
        footballClub1.assignMembers(clubMembers1);
        System.out.println("club budget after signing new member: " + footballClub1.getBudget());

        Clerk clerk1 = new Clerk("Max", "Mustermann", 35, 41.5);
        footballClub1.assignClerks(clerk1);

        for (int i = 0; i < footballClub1.getEmployees().size(); i++) {
            System.out.println("Club member: " + footballClub1.getEmployees().get(i).getLastName() + " " + footballClub1.getEmployees().get(i).getFirstName());
        }

    }
}

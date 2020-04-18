package va.CC;

import java.util.ArrayList;
import java.util.Random;

public class FootballClub {
    private String name;
    private String address;
    private double budget;
    private ArrayList<Clerk> employees;
    private ArrayList<Footballer> footballers;
    private ArrayList playerNumberList;
    public double membershipFee;
    public ArrayList<ClubMembers> clubMembers;

    public double getMembershipFee() {
        return membershipFee;
    }

    public void setMembershipFee(double membershipFee) {
        this.membershipFee = membershipFee;
    }

    public FootballClub(String name, String address, double budget, double membershipFee) {
        this.name = name;
        this.address = address;
        this.budget = budget;
        this.employees = new ArrayList<>();
        this.footballers = new ArrayList<>();
        this.playerNumberList = new ArrayList<>();
        this.membershipFee = membershipFee;
        this.clubMembers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public ArrayList<Clerk> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Clerk> employees) {
        this.employees = employees;
    }

    public ArrayList<Footballer> getFootballers() {
        return footballers;
    }

    public void setFootballers(ArrayList<Footballer> footballers) {
        this.footballers = footballers;
    }

    private double calculateSportsmanSalary() {
        double salary = budget / (employees.size() + footballers.size() + 1);
        return salary;
    }

    private double calculateWorkerWage() {
        double hourWage = ((budget / 1000) / (employees.size() + footballers.size() + 1));
        return hourWage;
    }

    public int assignPlayerNumber() {
        int newPlayerNumber = 0;
        Random random = new Random();
        while (newPlayerNumber == 0) {
            int temp = random.nextInt(100 - 1) + 1;
            if (playerNumberList.contains(temp)) {
                newPlayerNumber = 0;
                break;
            } else {
                newPlayerNumber = temp;
                break;
            }
        }
        return newPlayerNumber;
    }

    public void assignPlayer(Footballer footballer) {
        this.footballers.add(footballer);
        footballer.setSalary(calculateSportsmanSalary());
        footballer.setPlayerNumber(assignPlayerNumber());

    }

    public void playerList() {
        System.out.println("\nFootball Club " + this.name + " has " + this.getFootballers().size() + " members");
        for (int i = 0; i < getFootballers().size(); i++) {
            System.out.println("Player " + (i + 1) + " " + getFootballers().get(i).getLastName() + " with number " + getFootballers().get(i).getPlayerNumber() + " earns " + Math.round(getFootballers().get(i).getSalary()) + " € per month");
        }
    }

    public void assignManagement(Management management) {
        this.employees.add(management);
    }

    public void assignMembers(ClubMembers clubMember) {
        this.clubMembers.add(clubMember);
        this.budget = this.budget + this.membershipFee;
    }

    public void assignClerks(Clerk employees) {
        this.employees.add(employees);

    }
}

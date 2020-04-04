package va.CC;

import java.util.ArrayList;

public class FootbalClub {
    private String name;
    private String address;
    private ArrayList <Clerk> employees;
    private ArrayList <Footballer> footballers;

    public FootbalClub(String name, String address, ArrayList<Clerk> employees, ArrayList<Footballer> footballers) {
        this.name = name;
        this.address = address;
        this.employees = employees;
        this.footballers = footballers;
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


}

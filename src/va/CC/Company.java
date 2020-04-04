package va.CC;

import java.util.ArrayList;

public class Company {

    private String name;
    private String address;
    private ArrayList<Clerk> employees;

    public Company(String name, String address, ArrayList<Clerk> employees) {
        this.name = name;
        this.address = address;
        this.employees = employees;
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

    public void doBusiness() {
        System.out.println("earning money");
    }

}

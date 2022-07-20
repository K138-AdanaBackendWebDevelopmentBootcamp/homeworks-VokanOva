package Hw.Classes;

import javax.persistence.Entity;

@Entity

public class VisitingResearcher extends Instructor{
    private double sumHourlySalary;
    private int hourlyFee=35;
    //public Hw.Classes.VisitingResearcher() {}

    public VisitingResearcher(String coursesName, int phoneNumber, String address,double sumHourlySalary) {
        super(coursesName, phoneNumber, address);
        this.sumHourlySalary=sumHourlySalary;
    }

    public double getHourlySalary() {
        return sumHourlySalary*20;
    }

    public void setHourlySalary(double sumHourlySalary) {
        this.sumHourlySalary = sumHourlySalary;
    }


}
package Hw.Classes;

import javax.persistence.Entity;

@Entity

public class PermanentInstructor extends Instructor{
    private double fixedSalary;

    //public Hw.Classes.PermanentInstructor() {}

    public PermanentInstructor(String coursesName, int phoneNumber, String address, double fixedSalary) {
        super(coursesName, phoneNumber, address);
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}
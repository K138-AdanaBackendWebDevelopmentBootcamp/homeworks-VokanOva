package Main.Client.Models;
import javax.persistence.Entity;
import java.util.Objects;
@Entity
public class PermanentInstructor extends Instructor {

    private double fixSalary;

    public PermanentInstructor(String name, String address, String phNum, double fixSalary) {
        super(name, address, phNum);
        this.fixSalary = fixSalary;
    }

    public PermanentInstructor() {

    }

    public double getfixSalary() {
        return fixSalary;
    }

    public void setfixSalary(double fixSalary) {
        this.fixSalary = fixSalary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PermanentInstructor that = (PermanentInstructor) o;
        return Double.compare(that.fixSalary, fixSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fixSalary);
    }

    @Override
    public String toString() {
        return "PermanentTeacher{" +
                "fixSalary=" + fixSalary +
                "} " + super.toString();
    }
}

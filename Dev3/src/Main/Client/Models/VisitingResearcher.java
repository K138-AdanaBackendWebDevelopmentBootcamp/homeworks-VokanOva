package Main.Client.Models;
import javax.persistence.Entity;
import java.util.Objects;
@Entity
public class VisitingResearcher extends Instructor {
    private double hourSalary;

    public VisitingResearcher(String name, String address, String phNum, double hourSalary) {
        super(name, address, phNum);
        this.hourSalary = hourSalary;
    }

    public VisitingResearcher() {

    }

    public double gethourSalary() {
        return hourSalary;
    }

    public void sethourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VisitingResearcher that = (VisitingResearcher) o;
        return Double.compare(that.hourSalary, hourSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hourSalary);
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "hSalary=" + hourSalary +
                "} " + super.toString();
    }
}
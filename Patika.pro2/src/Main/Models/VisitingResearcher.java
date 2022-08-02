package Main.Models;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Entity
@Data
@NoArgsConstructor
public class VisitingResearcher extends Instructor {
    private Double hourlySalary;


    public VisitingResearcher(Double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher(String name, String address, String phoneNumber, Double hourlySalary) {
        super(name,address,phoneNumber);
        this.hourlySalary = hourlySalary;
    }


}

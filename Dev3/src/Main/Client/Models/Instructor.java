package Main.Client.Models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String phNum;

    public Instructor() {
    }
    @OneToMany
    private List <Course> courseList = new ArrayList<>();

    public List <Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
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

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    public int getId() {
        return id;
    }

    public Instructor(String name, String address, String phNum) {
        this.name = name;
        this.address = address;
        this.phNum = phNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instructor that = (Instructor) o;
        return phNum.equals(that.phNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phNum);
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phNum='" + phNum + '\'' +
                '}';
    }
}
package Main.Client.Models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String gender;
    private String birthDate;



    public Student(String name, String address, String gender, String birthDate) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.birthDate = birthDate;
    }
    @ManyToMany
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getId() {
        return id;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) && address.equals(student.address) && gender.equals(student.gender) && birthDate.equals(student.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, gender, birthDate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
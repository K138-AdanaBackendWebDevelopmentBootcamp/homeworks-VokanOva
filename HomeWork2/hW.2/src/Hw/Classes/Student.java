package Hw.Classes;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDate birthDate;
    private String adress;
    private String gender;

    @ManyToMany(mappedBy = "Student")

    private List<Course> courseList = new ArrayList<>();

    private List<Course> CourseList= new ArrayList<>();


    public Student() {
        this.name = name;
        this.birthDate = birthDate;
        this.adress = adress;
        this.gender = gender;
    }




    public Student(String name_, LocalDate of, String adress, String gender) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public List<Course> getCourseList() {
        return CourseList;
    }

    public void setCourseList(List<Course> courseList) {
        CourseList = courseList;
    }

    public void setGender(String gender) {
        this.gender = gender;

    }
    public void setCourse(Course... courses) {
        for (Course course:courses) {
            courseList.add(course);
            course.studentList.add(this);
        }
    }



    public int getId(){
        return id;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(birthDate, student.birthDate) && Objects.equals(adress, student.adress) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, adress, gender);
    }

    @Override
    public String toString() {
        return "Hw.Classes.Student{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", adress='" + adress + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    }

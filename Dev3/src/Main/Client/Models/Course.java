package Main.Client.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String code;
    private int score;

    public Course() {
    }

    public Course(String name, String code, int score) {
        this.name = name;
        this.code = code;
        this.score = score;
    }
    @ManyToMany
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }
    public void setStudent(List<Student> studentList){
        this.studentList=studentList;
    }
    @ManyToOne
    private Instructor instructor;


    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.code = name;
    }

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public int getscore() {
        return score;
    }

    public void setscore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return code.equals(course.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Course{" +
                "cName='" + name + '\'' +
                ", cCode='" + code + '\'' +
                ", cScore=" + score +
                '}';
    }


}

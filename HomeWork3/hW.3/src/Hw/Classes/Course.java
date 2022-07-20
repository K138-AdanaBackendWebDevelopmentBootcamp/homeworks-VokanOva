package Hw.Classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Course {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String coursesCode;
    private int creditScore;


    @ManyToOne
    List<Student> studentList= new ArrayList<>();
    @ManyToOne
    Instructor instructor;

    public Course(String name, String coursesCode, int creditScore) {
        this.name = name;
        this.coursesCode = coursesCode;
        this.creditScore = creditScore;
    }

    Course(){
        studentList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoursesCode() {
        return coursesCode;
    }

    public void setCoursesCode(String coursesCode) {
        this.coursesCode = coursesCode;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coursesCode='" + coursesCode + '\'' +
                ", creditScore=" + creditScore +
                '}';
    }
}

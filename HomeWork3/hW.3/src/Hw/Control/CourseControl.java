package Hw.Control;
import Hw.Classes.Course;
import Hw.Services.CourseServices;

import java.util.List;

public class CourseControl {
    private CourseServices coursesServices = new CourseServices();

    public List<Course> findAllCourses() {

        return coursesServices.findAll();
    }

    public Course findCoursesById(int id) {

        return coursesServices.findById(id);
    }
    public void saveCourses(Course course){

        coursesServices.saveToDatabase(course);
    }
    public void deleteCourses(Course course){

        coursesServices.deleteFromDatabase(course);
    }
    public void deleteByIdCourses(int id){
        coursesServices.deleteFromDatabase(id);
    }
    public void updateCourses(Course course,int id){
        coursesServices.updateOnDatabase(course,id);
    }
}

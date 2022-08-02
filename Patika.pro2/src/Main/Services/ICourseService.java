package Main.Services;
import Main.Models.Course;

import java.util.List;

public interface ICourseService {
    List<Course> findAllCourses();
    Course findCoursedById(Integer id);
    Course saveOneCourse(Course course);
    Course updateOneCourse(Course course, Integer id);
    void deleteCourseById(Integer id);
    void deleteOneCourse(Course course);
}

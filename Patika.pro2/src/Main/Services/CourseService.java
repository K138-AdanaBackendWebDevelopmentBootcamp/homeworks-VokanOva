package Main.Services;
import Main.Models.Course;
import Main.Repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseService {
    CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> findAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findCoursedById(Integer id) {
        return null;
    }


    @Override
    public Course saveOneCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateOneCourse(Course course, Integer id) {
        return null;
    }

    @Override
    public void deleteCourseById(Integer id) {
        courseRepository.deleteById(id);
    }

    @Override
    public void deleteOneCourse(Course course) {
        courseRepository.delete(course);
    }


}

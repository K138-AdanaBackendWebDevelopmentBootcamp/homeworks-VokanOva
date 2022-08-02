package Main.Controls;
import Main.Models.Course;
import Main.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class CourseController {
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<Course> findAllCourses(){
        return courseService.findAllCourses();
    }

    @GetMapping("/courses/{id}")
    public Course findCourseById(@PathVariable Integer id){
        return courseService.findCoursedById(id);
    }


    @DeleteMapping("/courses/{id}")
    public String deleteCourseById(@PathVariable("id") Integer id){
        courseService.deleteCourseById(id);

        return "Deleted Successfully";
    }

    @DeleteMapping("/courses/{course}")
    public String deleteOneCourse(@PathVariable("course") Course course){
        courseService.deleteOneCourse(course);
        return "Deleted Successfully";
    }

    @PostMapping("/courses")
    public Course saveOneCourse(@RequestBody Course course){
        return courseService.saveOneCourse(course);
    }

}

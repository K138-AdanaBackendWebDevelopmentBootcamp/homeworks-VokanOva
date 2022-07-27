package Main.Client.Repository;

import Main.Client.Models.Course;
import Main.Client.Models.Student;

import java.util.List;

public interface StudentRepository {
    void deleteStudentWithId(int id);

    List<Course> getStudentCourseList(Student student);
}

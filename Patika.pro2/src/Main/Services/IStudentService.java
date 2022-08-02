package Main.Services;
import Main.Models.Student;

import java.util.List;
public interface IStudentService {
    List<Student> findAllStudents();
    Student findStudentById(Integer id);
    Student saveOneStudent(Student student);
    Student updateOneStudent(Student student, Integer id);
    void deleteStudentById(Integer id);
    void deleteOneStudent(Student student);


}

package Main.Services;
import Main.Models.Student;
import Main.Repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> findAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findStudentById(Integer id) {
        return null;
    }

    @Override
    public Student saveOneStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateOneStudent(Student student, Integer id) {
        return null;
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void deleteOneStudent(Student student) {
        studentRepository.delete(student);
    }

}

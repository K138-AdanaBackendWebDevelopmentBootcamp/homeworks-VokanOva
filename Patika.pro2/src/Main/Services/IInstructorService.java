package Main.Services;
import Main.Models.Instructor;

import java.util.List;
public interface IInstructorService {
    List<Instructor> findAllInstructors();
    Instructor findInstructorById(Integer id);
    Instructor saveOneInstructor(Instructor instructor);
    Instructor updateOneInstructor(Instructor instructor, Integer id);
    void deleteInstructorById(Integer id);
    void deleteOneInstructor(Instructor instructor);

}

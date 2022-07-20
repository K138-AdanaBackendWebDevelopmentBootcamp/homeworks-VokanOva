package Hw.Control;
import Hw.Classes.Student;
import Hw.Services.StudentServices;

import java.util.List;
public class StudentControl {
    private StudentServices studentServices=new StudentServices();



    public List<Student> findAllStudent(){

        return studentServices.findAll();
    }

    public Student findStudentById(int id){

        return studentServices.findById(id);
    }

    public void saveStudent(Student student){

        studentServices.saveToDatabase(student);
    }

    public void deleteStudent(Student student){

        studentServices.deleteFromDatabase(student);
    }
    public void deleteByIdStudent(int id){
        studentServices.deleteFromDatabase(id);
    }
    public void updateStudent(Student student,int id){
        studentServices.updateOnDatabase(student,id);
    }

}

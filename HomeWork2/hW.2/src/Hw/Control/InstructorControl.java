package Hw.Control;
import Hw.Classes.Instructor;
import Hw.Services.InstructorServices;

import java.util.List;
public class InstructorControl {
    private InstructorServices instructorServices=new InstructorServices();

    public List findAllInstructor() {


        return instructorServices.findAll();
    }


    public Instructor findnstructorBYId(int id) {
        return instructorServices.findById(id);
    }


    public void saveToDatabase(Instructor instructor) {

        instructorServices.saveToDatabase(instructor);
    }
    public void deleteInstructor(Instructor instructor){

        instructorServices.deleteFromDatabase(instructor);
    }
    public void deleteByIdInstructor(int id){
        instructorServices.deleteFromDatabase(id);
    }
    public void updateCourses(Instructor instructor,int id){
        instructorServices.updateOnDatabase(instructor,id);
    }


}

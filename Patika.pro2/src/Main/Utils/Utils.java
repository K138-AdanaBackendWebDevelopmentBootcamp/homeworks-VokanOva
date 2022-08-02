package Main.Utils;
import Main.Models.*;
import Main.Repositories.CourseRepository;
import Main.Repositories.InstructorRepository;
import Main.Repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDate;

@RequiredArgsConstructor
@Component
@Transactional
public class Utils implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(InitializerRunner.class);

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final InstructorRepository instructorRepository;




    @Override
    public void run(String... args) throws Exception {



        Student student1 = new Student("Mahmoud", LocalDate.of(1995,02,3), "Bursa", "E");
        Student student2 = new Student("Emel", LocalDate.of(1995,02,3), "Bursa", "K");

        Course course1 = new Course("English", "111",9);
        Course course2 = new Course("Math", "222",9);
        Course course3 = new Course("History", "333",9);
        Course course4 = new Course("Drawing", "444",9);

        Instructor permanentInstructor1 = new PermanentInstructor("Mustafa", "Bursa", "555555555", 7500.5);
        Instructor permanentInstructor2 = new PermanentInstructor("Fatma", "Bursa", "544444444", 75003.5);

        Instructor visitingResearcher1 = new VisitingResearcher("Emel", "Bursa", "555554444", 1000.5);
        Instructor visitingResearcher2 = new VisitingResearcher("Halit", "Bursa", "55553333", 1000.5);


        course1.setInstructor(permanentInstructor1);
        course2.setInstructor(permanentInstructor2);
        course3.setInstructor(visitingResearcher1);
        course4.setInstructor(visitingResearcher2);

        course1.getStudentList().add(student1);
        course2.getStudentList().add(student1);
        course3.getStudentList().add(student2);
        course4.getStudentList().add(student2);

        studentRepository.save(student1);
        studentRepository.save(student2);
        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);
        courseRepository.save(course4);
        instructorRepository.save(permanentInstructor1);
        instructorRepository.save(permanentInstructor2);
        instructorRepository.save(visitingResearcher1);
        instructorRepository.save(visitingResearcher2);

        logger.info("All test data is saved");


    }
}

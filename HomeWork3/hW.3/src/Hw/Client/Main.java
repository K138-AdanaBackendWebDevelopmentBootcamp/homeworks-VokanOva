package Hw.Client;
import Hw.Classes.Course;
import Hw.Classes.Instructor;
import Hw.Classes.Student;
import Hw.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        saveTestData();

    }

    private static void saveTestData() {

        Student student1 = new Student("Volkan Blaci ",LocalDate.of(1999,01,01),"Istanbul","E");
        Student student2 = new Student("Zeliha Mutlu ",LocalDate.of(2000,07,12),"Istanbul","K");
        Student student3 = new Student("Hasan Huseyin  ",LocalDate.of(2001,02,10),"Istanbul","E");
        Student student4 = new Student(" Ercan Ucar",LocalDate.of(1998,07,15),"Istanbul","K");

        Course course1 = new Course("Matamatic","Mat",100);
        Course course2 = new Course("English","En",100);
        Course course3 = new Course("Social","So",100);
        Course course4 = new Course("Computer","co",100);

        Instructor instructor = new Instructor("Emel Tahtaci ",539212975,"Istanbul");
        Instructor instructor1 = new Instructor("Teoman Sahin ",539212975,"Istanbul");
        Instructor instructor2 = new Instructor("Salih Salih",539212975,"Istanbul");
        Instructor instructor3 = new Instructor("Fehmi Fehmi ",539212975,"Istanbul");

        student1.setCourse(course2,course3);
        student2.setCourse(course2,course4);
        student3.setCourse(course1,course4);
        student4.setCourse(course1,course2);




        EntityManager em = EntityManagerUtils.getEntityManager("mmysqlPU");
        try {
            em.getTransaction().begin();
            em.persist(course1);
            em.persist(course2);
            em.persist(course3);
            em.persist(course4);

            em.persist(student1);
            em.persist(student2);
            em.persist(student3);
            em.persist(student4);

            em.persist(instructor);
            em.persist(instructor1);
            em.persist(instructor2);
            em.persist(instructor3);


            em.getTransaction().commit();

            System.out.println("All data peristed.....");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }



    }





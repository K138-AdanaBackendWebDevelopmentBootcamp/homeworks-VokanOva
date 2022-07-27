package Main.Client;
import javax.persistence.EntityManager;

import Main.Client.Models.*;
import Main.Client.Utils.EntityManagerUtils;

public class Test {
    public static void main(String[] args) {
        saveData();

    }
    public static void saveData(){
        Student student1 = new Student("Halit","Bursa","E","05-02-1995");
        Student student2 = new Student("Emel","Bursa","K","06-06-1999");
        Student student3 = new Student("Korkmaz","Bursa","E","24.11.1996");
        Course course1=new Course("Mat","22",100);
        Course course2=new Course("En","33",100);
        Instructor instructor1=new PermanentInstructor("Mehmet","Bursa","1222",0.1905);
        Instructor instructor2=new VisitingResearcher("Can","Bursa","1333",25);

        course1.setInstructor(instructor1);
        course2.setInstructor(instructor2);
        course1.getStudentList().add(student1);
        course1.getStudentList().add(student3);
        course2.getStudentList().add(student2);

        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

        try {
            em.getTransaction().begin();

            em.persist(course1);
            em.persist(course2);
            em.persist(student1);
            em.persist(student2);
            em.persist(student3);
            em.persist(instructor1);
            em.persist(instructor2);

            em.getTransaction().commit();

            System.out.println("All data persisted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }

    }

}

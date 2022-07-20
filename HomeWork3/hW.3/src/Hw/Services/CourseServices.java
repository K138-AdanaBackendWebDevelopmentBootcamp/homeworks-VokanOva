package Hw.Services;
import Hw.Classes.Course;
import Hw.Repository.CrudRepository;
import Hw.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;
public class CourseServices implements CrudRepository<Course> {
    EntityManager em = EntityManagerUtils.getEntityManager("mmysqlPU");

    @Override
    public List<Course> findAll() {
        List<Course> CoursesList = em.createQuery("select c from Course c", Course.class).getResultList();


        return CoursesList;
    }

    @Override
    public Course findById(int id) {

        em.find(Course.class, id);

        return em.find(Course.class, id);
    }

    @Override
    public void saveToDatabase(Course course) {
        try {
            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
        }
    }

    @Override
    public void deleteFromDatabase(Course course) {
        try {
            em.getTransaction().begin();
            em.remove(course);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
        }

    }

    @Override
    public void deleteFromDatabase(int id) {
        try {
            em.getTransaction().begin();
            Course Foundcourse =findById(id);
            em.remove(Foundcourse);
            em.getTransaction().commit();
            System.out.println("Deleted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
        }

    }

    @Override
    public void updateOnDatabase(Course courses, int id) {

        try {
            em.getTransaction().begin();

            em.merge(courses);

            em.getTransaction().commit();
            System.out.println("Deleted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        }

        }



    }


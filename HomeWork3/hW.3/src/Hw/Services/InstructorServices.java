package Hw.Services;
import Hw.Classes.Instructor;
import Hw.Repository.CrudRepository;
import Hw.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;
public class InstructorServices implements CrudRepository<Instructor> {
    EntityManager em = EntityManagerUtils.getEntityManager("mmysqlPU");
    @Override
    public List<Instructor> findAll() {
        List<Instructor> InstructorList = em.createQuery("select c from Instructors c", Instructor.class).getResultList();
        return InstructorList;
    }
    @Override
    public Instructor findById(int id) {
        em.find(Instructor.class, id);

        return em.find(Instructor.class, id);

    }

    @Override
    public void saveToDatabase(Instructor instructor ){
        try {
            em.getTransaction().begin();
            em.persist(instructor);

            em.getTransaction().commit();

        }catch (Exception e){em.getTransaction().rollback();}
        finally {

        }
    }

    @Override
    public void deleteFromDatabase(Instructor instructor) {
        try {
            em.getTransaction().begin();
            em.remove(instructor);

            em.getTransaction().commit();

        }catch (Exception e){em.getTransaction().rollback();}
        finally {

        }

    }

    @Override
    public void deleteFromDatabase(int id) {

        try {
            em.getTransaction().begin();
            Instructor foundİnstructor=findById(id);
            em.remove(foundİnstructor);
            em.getTransaction().commit();

        }catch (Exception e){em.getTransaction().rollback();}
        finally {

        }


    }

    @Override
    public void updateOnDatabase(Instructor instructor, int id) {
        try {
            em.getTransaction().begin();

            em.merge(instructor);

            em.getTransaction().commit();
            System.out.println("Deleted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
        }





    }
}

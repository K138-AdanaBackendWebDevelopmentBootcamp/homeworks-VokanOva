package Main.Client.Dao;

import Main.Client.Models.Instructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

public interface InstructorDAOJPAImpl {

    import java.util.List;

    @Repository
    public class InstructorDAOJPAImpl implements InstructorDAO<Instructor> {
        private final EntityManager entityManager;

        public InstructorDAOJPAImpl(EntityManager entityManager) {
            this.entityManager = entityManager;
        }

        @Override
        @Transactional(readOnly = true)
        public List<Instructor> findAll() {
            return entityManager.createQuery("FROM Instructor ",Instructor.class).getResultList();
        }

        @Override
        @Transactional(readOnly = true)
        public Instructor findById(int id) {
            return (Instructor) entityManager.createQuery("FROM Instructor i WHERE i.id =:idParam")
                    .setParameter("idParam",id).getSingleResult();
        }
        @Override
        @Transactional
        public Instructor save(Instructor instructor) throws AlreadyExistsException {
            checkingObjectExistence(instructor);
            return entityManager.merge(instructor);
        }

        @Override
        @Transactional
        public void deleteById(int id) {
            Instructor foundOne = entityManager.createQuery("FROM Instructor i WHERE i.id=:idParam",Instructor.class)
                    .setParameter("idParam",id).getSingleResult();
            entityManager.remove(foundOne);
        }

        @Override
        @Transactional
        public void deleteByPhoneNumber(String phNum) {
            Instructor foundOne = entityManager.createQuery("FROM Instructor i WHERE i.phNum=:numberParam",Instructor.class)
                    .setParameter("numberParam",phNum).getSingleResult();
            entityManager.remove(foundOne);
        }

        @Override
        @Transactional
        public Instructor update(Instructor instructor, int id) {
            Instructor foundOne = entityManager.createQuery("FROM Instructor i WHERE i.id=:idParam ",Instructor.class).setParameter("idParam",id).getSingleResult();
            foundOne.setName(instructor.getName());
            foundOne.setAddress(instructor.getAddress());
            foundOne.setCourseList(instructor.getCourseList());
            foundOne.setPhone(instructor.getPhone());
            return entityManager.merge(foundOne);
        }

        @Override
        @Transactional
        public Instructor updateByPhoneNumber(Instructor instructor, Long phone_number) {
            Instructor foundOne = entityManager.createQuery("FROM Instructor i WHERE i.phNum=:phoneParam ",Instructor.class).setParameter("phoneParam",phone_number).getSingleResult();
            foundOne.setName(instructor.getName());
            foundOne.setAddress(instructor.getAddress());
            foundOne.setCourseList(instructor.getCourseList());
            return entityManager.merge(foundOne);
        }

        private void checkingObjectExistence(Instructor instructor) throws AlreadyExistsException {
            List<Instructor> foundInstructors = entityManager.createQuery("FROM Instructor i WHERE i.phoneNumber=:phoneParam ",Instructor.class)
                    .setParameter("phoneParam",instructor.getPhone()).getResultList();
            if(foundInstructors.size() > 0)
                throw new AlreadyExistsException(""+instructor+"\n"+"this instructor already exists !");
        }


}

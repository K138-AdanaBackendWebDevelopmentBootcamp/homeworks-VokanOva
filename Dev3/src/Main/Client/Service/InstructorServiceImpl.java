package Main.Client.Service;

import Main.Client.Dao.InstructorDAO;
import Main.Client.Models.Instructor;

import java.util.List;

@Service

public class InstructorServiceImpl {
    private final InstructorDAO<Instructor> InstructorDAO ;

    @Autowired
    public InstructorServiceImpl(Main.Client.Dao.InstructorDAO<Instructor> iInstructorDAO) {
        this.InstructorDAO = InstructorDAO;
    }

    @Override
    public List<Instructor> findAll() {
        return InstructorDAO.findAll();
    }

    @Override
    public Instructor findById(int id) {
        return InstructorDAO.findById(id);
    }

    @Override
    public Instructor save(Instructor instructor) {
        return InstructorDAO.save(instructor);
    }

    @Override
    public void deleteById(int id) {
        InstructorDAO.deleteById(id);
    }

    @Override
    public void deleteByPhoneNumber(Long phone_number) {
        InstructorDAO.deleteByPhoneNumber(phone_number);
    }

    @Override
    public Instructor update(Instructor instructor, int id) {
        return InstructorDAO.update(instructor,id);
    }
    @Override
    public Instructor updateByPhoneNumber(Instructor instructor,Long phone_number) {
        return InstructorDAO.updateByPhoneNumber(instructor, phone_number);
    }
}

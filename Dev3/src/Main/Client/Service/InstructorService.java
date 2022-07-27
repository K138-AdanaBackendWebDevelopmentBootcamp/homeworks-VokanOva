package Main.Client.Service;

public interface InstructorService <Instructor> extends BaseService<Instructor> {
    void deleteByPhoneNumber(String phNum);
    Instructor updateByPhoneNumber(Instructor instructor, String phNum);
}

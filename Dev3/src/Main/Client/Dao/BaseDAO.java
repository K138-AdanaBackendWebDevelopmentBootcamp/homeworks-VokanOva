package Main.Client.Dao;



import java.util.List;

public interface BaseDAO {
    List<T> findAll();
    T findById(int id);
    T save(T object) throws AlreadyExistsException;
    void deleteById(int id);
    T update(T object,int id);
}

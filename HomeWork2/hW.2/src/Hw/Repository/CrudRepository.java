package Hw.Repository;
import java.util.List;
public class CrudRepository {
    List<T> listAll();
    T findById(int id);
    void saveToDatabase(T t);
    void updateOnDatabase(T t, int id);
    void deleteFromDatabase(T t);
    void deleteFromDatabase(int id);


}

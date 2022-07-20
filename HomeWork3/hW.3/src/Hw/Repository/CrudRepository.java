package Hw.Repository;
import Hw.Classes.Course;

import java.util.List;
public abstract class CrudRepository {
    List<T> listAll();

    public abstract List<Course> findAll();

    T findById(int id);
    void saveToDatabase(T t);
    void updateOnDatabase(T t, int id);
    void deleteFromDatabase(T t);

    public abstract Course findById(int id);

    public abstract void saveToDatabase(Course course);

    public abstract void deleteFromDatabase(Course course);

    void deleteFromDatabase(int id);


    public abstract void deleteFromDatabase(int id);

    public abstract void updateOnDatabase(Course courses, int id);
}

package Main.Client.Service;

public interface BaseService {

    List<T> findAll();
    T findById(int id);
    T save(T object);
    void deleteById(int id);
    T update(T object);
}

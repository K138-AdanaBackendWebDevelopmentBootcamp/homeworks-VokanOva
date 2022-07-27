package Main.Client.Controllers;

import java.util.List;

public class BController {
    ResponseEntity<List<T>> getAll();
    ResponseEntity<T> getById(int id);
    ResponseEntity<T> updateById( T t ,int id);
    ResponseEntity<String> deleteById(int id);
    ResponseEntity<T> post(T t);



}

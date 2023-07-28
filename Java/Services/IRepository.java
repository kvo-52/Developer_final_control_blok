package Developer_final_control_blok_2.Java.Services;

import java.util.List;

public interface IRepository <T> {
  
        List <T> getAll();
        T getById(int id);
        int create(T item);
        int update(T item);  
        void delete (int item);  
}
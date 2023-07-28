package Developer_final_control_blok_2.Java.UserInterface;

import java.util.List;

public interface View <T>{
    
    String getName();
    String getBirthday();
    <U> void printAll (List <U> list, Class <U> clazz);
    void showMessage (String s);

}

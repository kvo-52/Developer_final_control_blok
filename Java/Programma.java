package Developer_final_control_blok_2.Java;

import Developer_final_control_blok_2.Java.Controller.PetController;
import Developer_final_control_blok_2.Java.Model.Pet;
import Developer_final_control_blok_2.Java.Services.*;
import Developer_final_control_blok_2.Java.UserInterface.ConsoleMenu;

public class Programma {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> myFarm = new PetRepository();
        PetController controller = new PetController(myFarm);
        new ConsoleMenu (controller).start();
    }
}  
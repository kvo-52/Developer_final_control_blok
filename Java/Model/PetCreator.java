package Developer_final_control_blok_2.Java.Model;

public class PetCreator extends Creator {

    @Override
    protected Pet createNewPet (PetType type) {

        switch (type) {
            case Cat:
                return new Cat();
            case Dog:
                return new Dog();
            case Hamster:
                return new Hamster();
            case Camel:
                return new Camel();
            case Hourse:
                return new Hourse();
            case Donkey:
                return new Donkey();    
        }
        return null;
    }
}

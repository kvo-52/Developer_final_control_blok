package Developer_final_control_blok_2.Java.Model;

public enum PetType {
    
    Cat,
    Dog,
    Hamster,
    Camel,
    Hourse,
    Donkey;

    public static PetType getType (int typeId){
        switch (typeId){
            case 1:
                return PetType.Cat;
            case 2:
                return PetType.Dog;
            case 3:
                return PetType.Hamster;
            case 4:
                return PetType.Camel;
            case 5:
                return PetType.Hourse;
            case 6:
                return PetType.Donkey;    
            default:
                return null;
        }
    }
}
package Zoo.Animal;

public class Bird extends Animal{

    public Bird(String name, String typeOfItsDiet) {
        super(name, typeOfItsDiet);
    }

    @Override
    public String breed() {
        return "by laying eggs";
    }
}

package Zoo.Animal;

public class Reptile extends Animal {

    public Reptile(String name, String typeOfItsDiet) {
        super(name, typeOfItsDiet);
    }

    @Override
    public String breed() {
        return "by laying eggs";
    }
}

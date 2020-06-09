package Zoo.Animal;

public class Mammal extends Animal {

    public Mammal(String name, String typeOfItsDiet) {
        super(name, typeOfItsDiet);
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }


}

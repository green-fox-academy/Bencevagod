package Zoo.Animal;

abstract public class Animal {
    protected String name;
    protected int age;
    protected String typeOfItsDiet;

    public Animal(String name, String typeOfItsDiet) {
        this.name = name;
        this.typeOfItsDiet = typeOfItsDiet;
    }

    public String getName() {
        return this.name;
    }

    public String getTypeOfItsDiet() {
        return this.typeOfItsDiet;
    }

    abstract public String breed();

    public boolean isCarnivore() {
        return this.getTypeOfItsDiet().equals("Carnivore") || this.getTypeOfItsDiet().equals("Omnivore");
    }

    public boolean isHerbivore() {
        return this.getTypeOfItsDiet().equals("Herbivore") || this.getTypeOfItsDiet().equals("Omnivore");
    }

    public boolean isOmnivore() {
        return this.getTypeOfItsDiet().equals("Omnivore");
    }

    public void getDietInfo() {
        System.out.println("The "+this.getName()+" is: carnivore "+this.isCarnivore()+", herbivore "+this.isHerbivore()
        +", omnivore "+this.isOmnivore()+".");
    }
}

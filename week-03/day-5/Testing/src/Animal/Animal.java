package Animal;

public class Animal {
    private int hunger;
    private int thirst;

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }

    public int getThirst() {
        return this.thirst;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void eat() {
        this.hunger -= 1;
    }

    public void drink() {
        this.thirst -= 1;
    }

    public void play() {
        this.hunger += 1;
        this.thirst += 1;
    }
}

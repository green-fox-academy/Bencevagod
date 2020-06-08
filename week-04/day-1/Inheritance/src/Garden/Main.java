package Garden;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.printElements();
        garden.waterGardenElements(40);
        garden.printElements();
        garden.waterGardenElements(70);
        garden.printElements();
    }
}

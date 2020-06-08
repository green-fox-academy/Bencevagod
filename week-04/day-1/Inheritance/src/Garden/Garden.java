package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> garden;
    private String name;

    public Garden() {
        garden = new ArrayList<Plant>();
        Plant flower = new Flower("yellow");
        garden.add(flower);
        Plant flower2 = new Flower("blue");
        garden.add(flower2);
        Plant tree = new Tree("purple");
        garden.add(tree);
        Plant tree2 = new Tree("orange");
        garden.add(tree2);
    }

    public Garden(String name) {
        garden = new ArrayList<Plant>();
    }

    public List<Plant> getGarden() {
        return this.garden;
    }

    public void printElements() {
        for (int i = 0; i < this.getGarden().size(); i++) {
            System.out.println(this.getGarden().get(i).getName());
        }
        System.out.println();
    }

    public void waterGardenElements(int amount) {
        for (int i = 0; i < this.getGarden().size(); i++) {
            this.getGarden().get(i).water(amount / this.getGarden().size());
        }
    }
}

package Zoo;

import Zoo.Animal.*;

public class Zoo {

    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile", "Carnivore");
        Mammal mammal = new Mammal("Koala", "Herbivore");
        Bird bird = new Bird("Parrot", "Herbivore");
        Mammal bear = new Mammal("Bear", "Omnivore");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
        System.out.println("A " + bear.getName() + " is breeding by " + bear.breed());
        System.out.println();
        mammal.getDietInfo();
        reptile.getDietInfo();
        bear.getDietInfo();
        bird.getDietInfo();

    }
}

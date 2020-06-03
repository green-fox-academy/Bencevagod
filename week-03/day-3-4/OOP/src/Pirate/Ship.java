package Pirate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    private List<Pirate> crew;
    private Pirate captain;

    public Ship() {
        this.crew =  new ArrayList<Pirate>();
    }

    public void fillShip() {
        int crewNumber = 0;
        Random r = new Random();
        while (crewNumber < r.nextInt(13)+1) {
            Pirate pirate = new Pirate(); //generates new pirates for the crew
            crew.add(pirate); //fills the ship with at least 1 pirate
        }
        this.captain = new Pirate(); //adds a captain
    }

    public void shipStatus() {
        System.out.print("The captain is ");
        this.captain.getState();
        crew.removeIf(crewMember -> crewMember.getIsDead()); //removes dead pirates from crew
        System.out.println("The number of still-alive crew members is "+crew.size());
    }
}

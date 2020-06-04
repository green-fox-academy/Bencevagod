package Pirate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    private List<Pirate> crew;
    private Pirate captain;
    private String name;

    public Ship(String name) {
        this.crew =  new ArrayList<Pirate>();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Pirate getCaptain() {
        return this.captain;
    }

    public List<Pirate> getCrew() {
        this.crew.removeIf(crewMember -> crewMember.getIsDead()); //removes dead pirates from crew
        return this.crew;
    }

    public void fillShip() {
        int crewNumber = 0;
        Random r = new Random();
        int crewGenerator = r.nextInt(9)+5;
        while (crewNumber < crewGenerator) {
            Pirate pirate = new Pirate("Crew member "+(crewNumber+1)); //generates new pirates for the crew
            crew.add(pirate); //fills the ship with at least 1 pirate
            crewNumber++;
        }
        this.captain = new Pirate("Captain"); //adds a captain
    }

    public void shipStatus() {
        System.out.print("The captain is ");
        this.captain.getState();
        System.out.println("The "+this.getName()+" has "+this.getCrew().size()+" members of the crew left!");
    }

    public boolean isWinnerShip(Ship ship1, Ship ship2) {
        return ship1.getCrew().size() - ship1.getCaptain().getRumCounter() > ship2.getCrew().size() - ship2.getCaptain().getRumCounter();
    }

    public void battle(Ship ship2) {
        if(isWinnerShip(this, ship2)) {
            Random r = new Random();
            int crewToRemove = r.nextInt(ship2.getCrew().size()+1);
            for (int i = ship2.getCrew().size(); i >= ship2.getCrew().size()-crewToRemove; i--) {
                ship2.getCrew().remove(i);
            }
            Random random = new Random();
            for (int i = 0; i < this.getCrew().size(); i++) {
                this.getCrew().get(i).setRumCounter(random.nextInt(6));
            }
            this.getCaptain().setRumCounter(random.nextInt(6));
        } else {
            Random r = new Random();
            int crewToRemove = r.nextInt(this.getCrew().size()+1);
            for (int i = this.getCrew().size(); i >= this.getCrew().size()-crewToRemove; i--) {
                this.getCrew().remove(i);
            }
            Random random = new Random();
            for (int i = 0; i < ship2.getCrew().size(); i++) {
                ship2.getCrew().get(i).setRumCounter(random.nextInt(6));
            }
            ship2.getCaptain().setRumCounter(random.nextInt(6));
        }
    }
}

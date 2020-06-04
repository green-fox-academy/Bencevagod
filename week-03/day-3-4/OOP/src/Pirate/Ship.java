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
        System.out.println("The "+this.getName()+" has a total crew of "+this.getCrew().size()+" pirates");
        System.out.println();
    }

    public void shipStatus() {
        System.out.print("The ");
        this.captain.getState();
        System.out.println("The "+this.getName()+" has "+this.getCrew().size()+" members of the crew left!");
        System.out.println();
    }

    public boolean isWinnerShip(Ship ship2) {
        return this.getCrew().size() - this.getCaptain().getRumCounter() > ship2.getCrew().size() - ship2.getCaptain().getRumCounter();
    }

    public void battle(Ship ship2) {
        if(this.isWinnerShip(ship2)) {
            System.out.println(this.getName()+" has won the battle!");
            System.out.println(ship2.getName()+" is sinking!");
            System.out.println();
            Random r = new Random();
            int crewToRemove = r.nextInt(ship2.getCrew().size()+1);
            for (int i = 0; i < ship2.getCrew().size()-crewToRemove; i++) {
                ship2.getCrew().remove(0);
            }
            ship2.shipStatus();
            Random random = new Random();
            for (int i = 0; i < this.getCrew().size(); i++) {
                this.getCrew().get(i).setRumCounter(random.nextInt(6));
            }
            this.getCaptain().setRumCounter(random.nextInt(6));
        } else {
            System.out.println(this.getName()+" has lost the battle, "+ship2.getName()+" has won!");
            System.out.println();
            Random r = new Random();
            int crewToRemove = r.nextInt(this.getCrew().size()+1);
            for (int i = 0; i < this.getCrew().size()-crewToRemove; i++) {
                this.getCrew().remove(0);
            }
            this.shipStatus();
            Random random = new Random();
            for (int i = 0; i < ship2.getCrew().size(); i++) {
                ship2.getCrew().get(i).setRumCounter(random.nextInt(6));
            }
            ship2.getCaptain().setRumCounter(random.nextInt(6));
        }
    }
}

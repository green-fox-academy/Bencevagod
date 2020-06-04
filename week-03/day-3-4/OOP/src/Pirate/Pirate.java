package Pirate;

import java.util.Random;

public class Pirate {
    private String name;
    private int rumCounter = 0;
    private boolean isDead = false;
    private boolean isPassedOut = false;

    public Pirate(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getRumCounter() {
        return this.rumCounter;
    }

    public boolean getIsDead() {
        return this.isDead;
    }

    public void getState() { //prints if the pirate is dead, passed out or alive
        if (this.isDead) {
            this.die();
            System.out.println("The consumed number of rums are "+this.getRumCounter());
        } else if (this.isPassedOut) {
            this.passOut();
            System.out.println("The consumed number of rums are "+this.getRumCounter());
        } else {
            System.out.println(this.getName()+" is still standin after "+this.getRumCounter()+" rums!");
        }
    }

    public void setRumCounter(int rumCount) {
        this.rumCounter += rumCount;
    }

    public void die() {
        isDead = true;
        System.out.println(this.getName()+" has died.");
    }

    public void passOut() {
        isPassedOut = true;
        System.out.println(this.getName()+" has passed out");
    }

    public void wakeUp() {
        this.isPassedOut = false;
        this.rumCounter = 0;
        System.out.println(this.getName()+" is back in business!");
    }

    public void drinkSomeRum() {
        if (!isDead && !isPassedOut) {
            rumCounter++;
        } else if (isDead){
            die();
        } else {
            passOut();
        }
    }

    public void howsItGoingMate() {
        if (!isDead && !isPassedOut) {
            if (rumCounter <= 4) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                passOut();
            }
        } else if (isDead){
            die();
        } else {
            passOut();
        }
    }

    public static void brawl(Pirate pirate1, Pirate pirate2) {
            //checks if both pirates are alive and standing
        if ((!pirate1.isDead && !pirate2.isDead) && (!pirate1.isPassedOut && !pirate2.isPassedOut)) {
            Random r = new Random();
            int chance = r.nextInt(3); // gives the 1/3 chance
            if (chance == 0) {
                pirate1.die();
            } else if (chance == 1) {
                pirate2.die();
            } else {
                pirate1.passOut();
                pirate2.passOut();
            }
        } else if (pirate1.isDead){
            pirate1.die();
        } else if (pirate2.isDead){
            pirate2.die();
        } else if (pirate1.isPassedOut) {
            pirate1.passOut();
        } else {
            pirate2.passOut();
        }
    }
}

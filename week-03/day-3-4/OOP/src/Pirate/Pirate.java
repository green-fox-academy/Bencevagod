package Pirate;

import java.util.Random;

public class Pirate {
    //private String name;
    private int rumCounter = 0;
    private boolean isDead = false;
    private boolean isPassedOut = false;

    //public Pirate(String name) {
    //    this.name = name;
    //}                commented out cuz ship gives error to the not given parameter

    public void drinkSomeRum() {
        if (!isDead && !isPassedOut) {
            rumCounter++;
        } else if (isDead){
            die();
        } else {
            passOut();
        }
    }

    public int getRumCounter() {
        return this.rumCounter;
    }

    public boolean getIsDead() {
        return isDead;
    }

    public void getState() { //prints if the pirate is dead, passed out or alive
        if (isDead) {
            die();
        } else if (isPassedOut) {
            passOut();
        } else {
            System.out.println("Still standin!");
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

    public void die() {
        isDead = true;
        //String name = this.getName(); , this would give the variable name, so no name parameter needed
        System.out.println(this.toString()+" has died."); //somehow needs to print the pirate who died
    }

    public void passOut() {
        isPassedOut = true;
        System.out.println(this.toString()+" has passed out"); //same as with the die() method
    }

    public void brawl(Pirate pirate1, Pirate pirate2) {
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
            die();
        } else if (pirate2.isDead){
            die();
        } else if (pirate1.isPassedOut) {
            passOut();
        } else {
            passOut();
        }
    }
}

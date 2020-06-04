package Pirate;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Pirate piri = new Pirate("Piri");

        piri.drinkSomeRum();
        piri.howsItGoingMate();
        for (int i = 0; i < 5; i++) {
            piri.drinkSomeRum();
        }
        piri.howsItGoingMate();

        piri.drinkSomeRum();

        Pirate pirike = new Pirate("Pirike");

        //pirike.brawl(piri, pirike);

        Ship sailingSalmon = new Ship("Sailing Salmon");
        sailingSalmon.fillShip();
        Ship silverCharcoal = new Ship("Silver Charcoal");
        silverCharcoal.fillShip();

        sailingSalmon.battle(silverCharcoal);

        Armada army = new Armada("Army");
        army.fillArmada();
        Armada arma = new Armada("Arma");
        arma.fillArmada();
        arma.war(army);

    }
}

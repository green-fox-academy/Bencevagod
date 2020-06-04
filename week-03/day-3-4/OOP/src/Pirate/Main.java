package Pirate;

public class Main {
    public static void main(String[] args) {
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
        sailingSalmon.shipStatus();
        piri.wakeUp();
        Pirate.brawl(piri, pirike);
        piri.howsItGoingMate();
        pirike.howsItGoingMate();

        sailingSalmon.getCaptain().drinkSomeRum();
        sailingSalmon.getCaptain().howsItGoingMate();

    }
}

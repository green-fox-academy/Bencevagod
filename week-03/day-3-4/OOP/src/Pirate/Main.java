package Pirate;

public class Main {
    public static void main(String[] args) {
        Pirate piri = new Pirate();

        piri.drinkSomeRum();
        piri.howsItGoingMate();
        for (int i = 0; i < 5; i++) {
            piri.drinkSomeRum();
        }
        piri.howsItGoingMate();
        System.out.println(piri.toString());

    }
}

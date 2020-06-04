package Pirate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//armada war egy while (armada.size > 0) kell bele egy wait, hogy ne legyen tul gyors
public class Armada {
    private List<Ship> armada;
    private String armadaName;

    public Armada(String armadaName) {
        this.armada = new ArrayList<Ship>();
        this.armadaName = armadaName;
    }

    public String getArmadaName() {
        return this.armadaName;
    }

    public List<Ship> getArmada() {
        return this.armada;
    }

    public void fillArmada() {
        for (int i = 1; i <= 6; i++) {
            Ship ship = new Ship(this.getArmadaName()+" Ship"+i);
            ship.fillShip();
            this.armada.add(ship);
        }
    }

    public void war(Armada otherArmada) throws InterruptedException {
        while (this.getArmada().size()>0 && otherArmada.getArmada().size()>0) {
            //this.getArmada().get(0).battle(otherArmada.getArmada().get(0));
            if (this.getArmada().get(0).isWinnerShip(otherArmada.getArmada().get(0))) {
                otherArmada.getArmada().remove(0);
                System.out.println(this.getArmadaName()+" has won this battle!");
                System.out.println();
            } else {
                this.getArmada().remove(0);
                System.out.println(otherArmada.getArmadaName()+" has won this battle!");
                System.out.println();
            }
            TimeUnit.SECONDS.sleep(2);
        }
        if (this.getArmada().size() == 0) {
            System.out.println(otherArmada.getArmadaName()+" has won the war!");
        } else {
            System.out.println(this.getArmadaName()+" has won the war!");
        }
    }
}

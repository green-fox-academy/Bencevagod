package Aircraft_Carrier;

import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {
    private int hp;
    private int ammoReserve;
    List<Aircraft> aircrafts;

    public AircraftCarrier(int hp, int ammoReserve) {
        this.aircrafts = new ArrayList<Aircraft>();
        this.hp = hp;
        this.ammoReserve = ammoReserve;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAmmoReserve() {
        return this.ammoReserve;
    }

    public void setAmmoReserve(int change) {
        this.ammoReserve -= change;
    }

    public List<Aircraft> getAircrafts() {
        return this.aircrafts;
    }

    public int getAllTheDamage() {
        int allTheDamage = 0;
        for (int i = 0; i < this.getAircrafts().size(); i++) {
            allTheDamage+= this.getAircrafts().get(i).getAllDamage();
        }
        return allTheDamage;
    }

    public void add(Aircraft a) {
        this.getAircrafts().add(a);
    }

    public int fill() throws Exception {
        int howMuchAmmoNeeded = 0;
        for (int i = 0; i < this.getAircrafts().size(); i++) {
            howMuchAmmoNeeded += this.getAircrafts().get(i).maxAmmo - this.getAircrafts().get(i).getAmmoCount();
        }
        if (howMuchAmmoNeeded <= this.getAmmoReserve()) {
            for (int i = 0; i < this.getAircrafts().size(); i++) {
                this.getAircrafts().get(i).refill(this.ammoReserve);
                System.out.println(this.getAircrafts().get(i).getStatus());
                this.setAmmoReserve(this.getAircrafts().get(i).refill(this.ammoReserve));
            }
        } else if (this.getAmmoReserve() == 0) {
            throw new Exception("The carrier is out of ammo!");
        } else {
            for (int i = 0; i < this.getAircrafts().size(); i++) {
                if (this.getAircrafts().get(i).isPriority())
                    this.setAmmoReserve(this.getAircrafts().get(i).refill(this.ammoReserve));
            }
        }
        return this.getAmmoReserve();
    }

    public void getStatus() {
        System.out.println("HP: "+this.getHp()+", Aircraft Count: "+getAircrafts().size()+", Ammo Storage: "
        +this.getAmmoReserve()+", Total Damage: "+this.getAllTheDamage());
    }
}

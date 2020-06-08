package Aircraft_Carrier;

public class Aircraft {
    protected int maxAmmo;
    protected int baseDamage;
    protected int ammoCount;
    protected int allDamage;

    public Aircraft() {
        this.ammoCount = 0;
    }

    public int getMaxAmmo() {
        return this.maxAmmo;
    }

    public int getBaseDamage() {
        return this.baseDamage;
    }

    public int getAmmoCount() {
        return this.ammoCount;
    }

    public void setAmmoCount(int num) {
        this.ammoCount = num;
    }

    public int getAllDamage() {
        return this.getAmmoCount()*this.getBaseDamage();
    }

    public void fight() {
        if (this.ammoCount == 0) {
            System.out.println("Warning out of ammo!");
        } else {
            this.allDamage = this.getBaseDamage() * this.getAmmoCount();
            this.ammoCount = 0;
        }
    }

    public int refill(int ammo) {
        int intialAmmoCount = this.ammoCount;
        this.ammoCount += ammo;
        if (this.getAmmoCount() > this.getMaxAmmo()) {
            this.ammoCount = this.getMaxAmmo();
            return ammo - (this.getMaxAmmo() - intialAmmoCount);
        }
        return 0;
    }

    public String getType() {
        return "";
    }

    public String getStatus() {
        return "Type "+this.getType()+", Ammo: "+this.getAmmoCount()+", Base Damage: "+this.getBaseDamage()+
                ", All Damage: "+this.getAmmoCount()*this.getBaseDamage();
    }

    public boolean isPriority() {
        return this.getType().equals("F35");
    }
}

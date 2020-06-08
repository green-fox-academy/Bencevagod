package Aircraft_Carrier;

public class F35 extends Aircraft{
    public F35(){
        super();
        this.maxAmmo = 12;
        this.baseDamage = 50;
    }

    @Override
    public String getType() {
        return "F35";
    }
}

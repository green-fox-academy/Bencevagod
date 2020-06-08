package Aircraft_Carrier;

public class F16 extends Aircraft{
    public F16(){
        super();
        this.maxAmmo = 8;
        this.baseDamage = 30;
    }

    @Override
    public String getType() {
        return "F16";
    }
}

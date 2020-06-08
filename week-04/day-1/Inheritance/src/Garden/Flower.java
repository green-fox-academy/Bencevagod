package Garden;

public class Flower extends Plant{
    public Flower (String color) {
        super(color);
        this.neededWater = 5;
        this.absorbRate = .75f;
    }

    @Override
    public String getType() {
        return "Flower";
    }

    @Override
    public float getNeededWater() {
        return 5;
    }

    @Override
    public float getAbsorbRate() {
        return .75f;
    }

    @Override
    public float getWaterAmount() {
        return this.waterAmount;
    }

}

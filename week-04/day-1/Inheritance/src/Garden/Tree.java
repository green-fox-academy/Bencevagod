package Garden;

public class Tree extends Plant{
    public Tree(String color) {
        super(color);
        this.neededWater = 10;
        this.absorbRate = .4f;
    }

    @Override
    public String getType() {
        return "Tree";
    }

    @Override
    public float getNeededWater() {
        return 10;
    }

    @Override
    public float getAbsorbRate() {
        return .4f;
    }

    @Override
    public float getWaterAmount() {
        return this.waterAmount;
    }
}

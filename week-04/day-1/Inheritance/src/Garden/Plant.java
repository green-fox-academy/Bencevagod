package Garden;

public class Plant {
    protected String color;
    protected float neededWater;
    protected float absorbRate;
    protected float waterAmount;
    protected String needswater;

    public Plant(String color) {
        this.color = color;
        this.waterAmount = 0;
    }

    public String getColor() {
        return this.color;
    }

    public String getType() {
        return "Plant";
    }

    public float getNeededWater() {
        return this.neededWater;
    }

    public float getAbsorbRate() {
        return this.absorbRate;
    }

    public float getWaterAmount() {
        return this.waterAmount;
    }

    public String getNeedswater() {
        if (this.waterAmount<this.neededWater) {
            return " needs water";
        }
        return " doesn't need water";
    }

    public String getName() {
        return "The "+this.getColor()+" "+this.getType()+this.getNeedswater();
    }


    public void water(int amount) {
        if (this.waterAmount<this.neededWater) {
            this.waterAmount += amount * this.getAbsorbRate();
        } else {
            this.needswater = " doesn't need water";
        }
    }
}

package PetrolStation;

public class PetrolStation {
    private int gasAmount;

    public PetrolStation (int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public int getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount() {
        this.gasAmount = gasAmount;
    }

    public void refill(Car car) {
        this.gasAmount -= (car.getCapacity() - car.getGasAmount());
        car.setGasAmount(car.getCapacity() - car.getGasAmount());
    }
}


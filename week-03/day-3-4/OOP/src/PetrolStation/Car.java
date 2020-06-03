package PetrolStation;

public class Car {
    private int gasAmount, capacity;

    public Car (int capacity, int gasAmount) {
        this.capacity = capacity;
        this.gasAmount = gasAmount;
    }

    public int getGasAmount() {
        return this.gasAmount;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setGasAmount( int litresOfGas) {
        this.gasAmount += litresOfGas;
    }
}

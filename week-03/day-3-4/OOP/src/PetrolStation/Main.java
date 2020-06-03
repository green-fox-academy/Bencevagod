package PetrolStation;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(100, 0);
        PetrolStation petrolStation = new PetrolStation(1000);
        petrolStation.refill(car1);
        System.out.println(car1.getGasAmount());
        System.out.println(petrolStation.getGasAmount());

    }
}

package Cuboid;

public class Cuboid {
    public static void main(String[] args) {
        int sideA = 50;
        int sideB = 150;
        int sideC = 75;

        int surfaceArea = 2 * (sideA * sideB + sideA * sideC + sideB * sideC);
        int volume = sideA * sideB * sideC;
    }
}

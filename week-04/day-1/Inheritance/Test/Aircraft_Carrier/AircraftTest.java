package Aircraft_Carrier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AircraftTest {

    @Test
    void refillWithZeroAmmoCount() {
        F35 f35 = new F35();
        assertEquals(1000 - f35.getMaxAmmo(), f35.refill(1000));
    }

    @Test
    void refillWithNonZeroAmmoCount() {
        F35 f35 = new F35();
        f35.setAmmoCount(4);
        assertEquals(1000 - (f35.getMaxAmmo()-f35.getAmmoCount()), f35.refill(1000));
    }
}
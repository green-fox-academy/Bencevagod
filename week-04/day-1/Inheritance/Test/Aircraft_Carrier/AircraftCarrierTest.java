package Aircraft_Carrier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AircraftCarrierTest {

    @Test
    void fill() throws Exception {
        AircraftCarrier bla = new AircraftCarrier(1000, 20);
        Aircraft f35 = new F35();
        Aircraft f16 = new F16();
        assertEquals(0, bla.fill());
    }
}
package stock;

import enums.AccessoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAccessory {

    Accessory accessory;

    @Before
    public void setUp() throws Exception {
        accessory = new Accessory("Long-handled drum stick", AccessoryType.DRUM_STICK, 22.50);
    }

    @Test
    public void getDescription() {
        assertEquals("Long-handled drum stick", accessory.getDescription());
    }

    @Test
    public void getAccessoryType() {
        assertEquals(AccessoryType.DRUM_STICK, accessory.getAccessoryType());
    }

    @Test
    public void getWholeSalePrice___100Percent() {
        assertEquals(22.50, accessory.getWholeSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup___50Percent() {
        assertEquals(11.25, accessory.calculateMarkUp(), 0.01);
    }

    @Test
    public void getRetailPrice___WholeSalePricePLUSMarkup___150Percent() {
        assertEquals(33.75, accessory.getRetailPrice(), 0.01);
    }
}

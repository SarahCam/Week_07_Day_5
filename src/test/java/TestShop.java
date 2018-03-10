import enums.*;
import instruments.Drum;
import instruments.Guitar;
import instruments.Piano;
import interfaces.ISell;
import org.junit.Before;
import org.junit.Test;
import stock.Accessory;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestShop {

    Shop shop;
    ArrayList<ISell> stockItems;
    Piano piano;
    Guitar guitar;
    Drum drum;
    Accessory musicSheet;

    @Before
    public void setUp() throws Exception {
        stockItems = new ArrayList<>();
        shop = new Shop("Wee Al's Trumpet Emporium");
        piano = new Piano(  InstrumentColour.BROWN,
                            InstrumentMake.STEINWAY,
                            InstrumentMaterial.WOOD,
                            InstrumentType.KEYBOARD,
                            1540.00,
                            PianoType.UPRIGHT);
        musicSheet = new Accessory("Beethoven", AccessoryType.SHEET_MUSIC, 10.50);
    }

    @Test
    public void canGetShopName() {
        assertEquals("Wee Al's Trumpet Emporium", shop.getName());
    }

    @Test
    public void canGetStockItems() {
        assertEquals(0, shop.getStockCount());
        assertEquals(stockItems, shop.getStockItems());
    }

    @Test
    public void canAddPianoToStock() {
        shop.addStockItem(piano);
        assertEquals(1, shop.getStockCount());
        assert(shop.getStockItems().get(0) instanceof Piano);
    }

    @Test
    public void canAddAccessoryToStock() {
        shop.addStockItem(musicSheet);
        assertEquals(1, shop.getStockCount());
        assert(shop.getStockItems().get(0) instanceof Accessory);
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addStockItem(piano);
        shop.addStockItem(musicSheet);
        assertEquals(2, shop.getStockCount());
        assert(shop.getStockItems().get(0) instanceof Piano);
        assert(shop.getStockItems().get(1) instanceof Accessory);
        shop.removeStockItem(piano);
        assertEquals(1, shop.getStockCount());
        assert(shop.getStockItems().get(0) instanceof Accessory);
    }
}

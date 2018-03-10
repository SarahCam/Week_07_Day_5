import interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestShop {

    Shop shop;
    ArrayList<ISell> stockItems;

    @Before
    public void setUp() throws Exception {
        stockItems = new ArrayList<>();
        shop = new Shop("Wee Al's Trumpet Emporium");
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
}

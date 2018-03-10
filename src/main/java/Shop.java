import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stockItems;

    public Shop(String name) {
        this.name = name;
        this.stockItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStockItems() {
        return stockItems;
    }

    public int getStockCount() {
        return stockItems.size();
    }
}

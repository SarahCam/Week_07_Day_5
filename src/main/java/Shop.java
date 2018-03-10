import instruments.Piano;
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

    public void addStockItem (ISell stockItem) {
        stockItems.add(stockItem);
    }

    public void removeStockItem(ISell stockItem) {
        stockItems.remove(stockItem);
    }

    public double getPotentialProfit() {
        double potentialProfit = 0;
        for(ISell stockItem : stockItems){
            potentialProfit += stockItem.calculateMarkUp();
        }
        return potentialProfit;
    }
}

package stock;

import enums.AccessoryType;
import interfaces.ISell;

public class Accessory implements ISell {

    private String description;
    private AccessoryType accessoryType;
    private double wholeSalePrice;
    private double retailPrice;

    public Accessory(String description, AccessoryType accessoryType, double wholeSalePrice) {
        this.description = description;
        this.accessoryType = accessoryType;
        this.wholeSalePrice = wholeSalePrice;
        this.retailPrice = wholeSalePrice + calculateMarkUp();
    }

    public String getDescription() {
        return description;
    }

    public AccessoryType getAccessoryType() {
        return accessoryType;
    }

    public double getWholeSalePrice() {
        return wholeSalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    @Override
    public double calculateMarkUp() {
        return wholeSalePrice * 50/100;
    }
}

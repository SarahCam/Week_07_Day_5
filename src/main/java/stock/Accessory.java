package stock;

import enums.AccessoryType;

public class Accessory {

    private String description;
    private AccessoryType accessoryType;
    private double wholeSalePrice;
    private double retailPrice;

    public Accessory(String description, AccessoryType accessoryType, double wholeSalePrice) {
        this.description = description;
        this.accessoryType = accessoryType;
        this.wholeSalePrice = wholeSalePrice;
        this.retailPrice = 0;                    // Initialize to zero/null until we have calculated the markup
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
}
package com.designPatters.Builder;

public class InvoiceItem {
    private String itemName;
    private double value;

    public InvoiceItem(String itemName, double value) {
        this.itemName = itemName;
        this.value = value;
    }

    public static InvoiceItemBuilder builder() {
        return new InvoiceItemBuilder();
    }

    public String getItemName() {
        return itemName;
    }

    public double getValue() {
        return value;
    }
}

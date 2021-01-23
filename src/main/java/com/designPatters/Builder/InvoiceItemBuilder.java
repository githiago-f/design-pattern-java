package com.designPatters.Builder;

public class InvoiceItemBuilder implements Builder<InvoiceItem> {
    private String itemName;
    private double value;

    public InvoiceItemBuilder itemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public InvoiceItemBuilder value(double value) {
        this.value = value;
        return this;
    }

    @Override
    public InvoiceItem build() {
        return new InvoiceItem(itemName, value);
    }
}

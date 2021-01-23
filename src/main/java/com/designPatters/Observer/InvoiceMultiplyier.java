package com.designPatters.Observer;

import com.designPatters.Builder.Invoice;

public class InvoiceMultiplyier implements InvoiceAction {
    private final double value;

    public  InvoiceMultiplyier(double value) {
        this.value = value;
    }

    @Override
    public void execute(Invoice invoice) {
        double result = invoice.getGrossAmount() * value;
        System.out.printf("Resultado: %s%n", result);
    }
}

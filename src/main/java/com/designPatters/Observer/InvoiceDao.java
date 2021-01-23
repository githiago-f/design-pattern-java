package com.designPatters.Observer;

import com.designPatters.Builder.Invoice;

public class InvoiceDao implements InvoiceAction {
    @Override
    public void execute(Invoice invoice) {
        System.out.println("Persisting: " + invoice.getCompanyName());
    }
}

package com.designPatters.Observer;

import com.designPatters.Builder.Invoice;

public class MailAdapter implements InvoiceAction {
    @Override
    public void execute(Invoice invoice) {
        System.out.println("Sending email for: " + invoice.getCompanyName());
    }
}

package com.designPatters;

import com.designPatters.Builder.Invoice;
import com.designPatters.Builder.InvoiceBuilder;
import com.designPatters.Observer.InvoiceAction;
import com.designPatters.Observer.InvoiceMultiplyier;

import java.util.Calendar;

class Main {
    public static void main(String[] args) {
        InvoiceBuilder invoiceBuilder = Invoice.builder();

        InvoiceAction invoiceAction = new InvoiceMultiplyier(0.30);

        invoiceBuilder
            .addInvoiceAction((Invoice i) -> {
                System.out.println("Using functional interface");
            })
            .addInvoiceAction(invoiceAction);

        invoiceBuilder
            .companyName("Any Co.")
            .cnpj("12.345.678/00001-00")
            .grossAmount(100)
            .tax(100 * 0.04)
            .dateOfIssue(Calendar.getInstance())
            .observation("Observação aqui")
            .build();
    }
}
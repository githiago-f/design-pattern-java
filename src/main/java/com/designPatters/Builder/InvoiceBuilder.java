package com.designPatters.Builder;

import com.designPatters.Observer.InvoiceAction;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InvoiceBuilder implements Builder<Invoice> {

    private String company;
    private String cnpj;
    private double grossAmount;
    private double tax;
    private Calendar dateOfIssue;
    private String observation;

    private final List<InvoiceAction> allInvoiceActions = new ArrayList<>();

    public InvoiceBuilder companyName(String company) {
        this.company = company;
        return this;
    }

    public InvoiceBuilder cnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public InvoiceBuilder grossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
        return this;
    }

    public InvoiceBuilder tax(double tax) {
        this.tax = tax;
        return this;
    }

    public InvoiceBuilder dateOfIssue(Calendar dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
        return this;
    }

    public InvoiceBuilder observation(String observation) {
        this.observation = observation;
        return this;
    }

    public InvoiceBuilder addInvoiceAction(InvoiceAction action) {
        allInvoiceActions.add(action);
        return this;
    }

    @Override
    public Invoice build() {
        final Invoice invoice = new Invoice(
                company,
                cnpj,
                grossAmount,
                tax,
                dateOfIssue,
                observation
        );

        allInvoiceActions.forEach(
                invoiceAction -> invoiceAction.execute(invoice)
        );

        return invoice;
    }
}

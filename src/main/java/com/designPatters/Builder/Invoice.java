package com.designPatters.Builder;

import java.util.Calendar;

public class Invoice {
    private final String companyName;
    private final String cnpj;
    private final double grossAmount;
    private final double tax;
    private final Calendar dateOfIssue;
    private final String observation;

    public Invoice(String companyName, String cnpj, double grossAmount,
                   double tax, Calendar dateOfIssue, String observation) {
        this.companyName = companyName;
        this.cnpj = cnpj;
        this.grossAmount = grossAmount;
        this.tax = tax;
        this.dateOfIssue = dateOfIssue;
        this.observation = observation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public double getTax() {
        return tax;
    }

    public Calendar getDateOfIssue() {
        return dateOfIssue;
    }

    public String getObservation() {
        return observation;
    }

    public static InvoiceBuilder builder() {
        return new InvoiceBuilder();
    }
}

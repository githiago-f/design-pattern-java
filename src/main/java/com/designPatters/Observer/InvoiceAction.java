package com.designPatters.Observer;

import com.designPatters.Builder.Invoice;

public interface InvoiceAction {
    void execute(Invoice invoice);
}

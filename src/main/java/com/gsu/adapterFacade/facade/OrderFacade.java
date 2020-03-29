package com.gsu.adapterFacade.facade;

import com.gsu.adapterFacade.facade.services.Billing;
import com.gsu.adapterFacade.facade.services.OrderFulfill;
import com.gsu.adapterFacade.facade.services.Shipping;

public class OrderFacade {

    private final OrderFulfill orderFulfill;
    private final Billing billing;
    private final Shipping shipping;

    public OrderFacade(final Billing billing, final OrderFulfill orderFulfill, final Shipping shipping) {
        this.billing = billing;
        this.orderFulfill = orderFulfill;
        this.shipping = shipping;
    }

    public void createOrder() {
        if (orderFulfill.isProductExists()) {
            orderFulfill.orderFromStorage();
            billing.drawUpInvoices();
            billing.createBill();
        }
    }

    public void getPayment() {
        this.billing.getPayment();
        this.shipping.getPayment();
    }

    public void shipOrder() {
        this.shipping.shipOrder();
    }
}

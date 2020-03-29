package com.gsu.adapterFacade.facade.services;

public class OrderFulfill {
    public boolean isProductExists() {
        System.out.println("Product checked");
        return true;
    }

    public void orderFromStorage() {
        System.out.println("Product ordered from storage");
    }
}

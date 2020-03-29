package com.gsu.adapterFacade;

import com.gsu.adapterFacade.adapter.IteratorAdapter;
import com.gsu.adapterFacade.facade.OrderFacade;
import com.gsu.adapterFacade.facade.services.Billing;
import com.gsu.adapterFacade.facade.services.OrderFulfill;
import com.gsu.adapterFacade.facade.services.Shipping;

import java.util.*;

public final class Main {
    public static void main(String[] args) {
        adapterTest();
        facadeTest();
    }

    private static void adapterTest() {
        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
        IteratorAdapter<String> adapter = new IteratorAdapter<>(list.iterator());
        while (adapter.hasMoreElements()) {
            System.out.println(adapter.nextElement());
        }
    }

    private static void facadeTest() {
        OrderFacade facade = new OrderFacade(new Billing(), new OrderFulfill(), new Shipping());
        facade.createOrder();
        facade.getPayment();
        facade.shipOrder();
    }
}

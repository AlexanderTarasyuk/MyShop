package com.alextarasyuk.myshop.core.events;

/**
 * Created by Alex on 4/08/2018.
 */
public class CustomerSelectedEvent {
    private final String customerName;


    public CustomerSelectedEvent(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }


}

package com.alextarasyuk.myshop.core.listeners;

import com.alextarasyuk.myshop.models.Customer;

/**
 * Created by Alex on 4/08/2018.
 */
public interface OnCustomerSelectedListener {
    void onSelectCustomer(Customer customer);
    void onLongClickProduct(Customer clickedCustomer);
}

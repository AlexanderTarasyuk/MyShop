package com.alextarasyuk.myshop.core.listeners;

import com.alextarasyuk.myshop.models.Customer;
import com.alextarasyuk.myshop.models.SalesTransaction;
/**
 * Created by Alex on 4/08/2018.
 */
public interface OnTransactionSelectedListener {
    void onSelectTransaction(SalesTransaction transaction);
    Customer getCustomer(long id);
}

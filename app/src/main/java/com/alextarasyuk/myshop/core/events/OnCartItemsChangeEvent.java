package com.alextarasyuk.myshop.core.events;

/**
 * Created by Alex on 4/08/2018.
 */

public class OnCartItemsChangeEvent {

    private final double totalAmount;
    private final int numberOfItems;

    public OnCartItemsChangeEvent(double totalAmount, int numberOfItems) {
        this.totalAmount = totalAmount;
        this.numberOfItems = numberOfItems;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
}

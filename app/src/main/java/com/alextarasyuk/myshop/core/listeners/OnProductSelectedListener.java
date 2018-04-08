package com.alextarasyuk.myshop.core.listeners;

import com.alextarasyuk.myshop.models.Product;

/**
 * Created by Alex on 4/08/2018.
 */
public interface OnProductSelectedListener {
    void onSelectProduct(Product selectedProduct);
    void onLongClickProduct(Product clickedProduct);
}

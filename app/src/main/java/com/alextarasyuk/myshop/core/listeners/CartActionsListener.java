package com.alextarasyuk.myshop.core.listeners;

import com.alextarasyuk.myshop.models.LineItem;

/**
 * Created by Alex on 4/08/2018.
 */
public interface CartActionsListener {
   void onItemDeleted(LineItem item);
   void onItemQtyChange(LineItem item, int qty);

}

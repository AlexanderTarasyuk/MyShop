package com.alextarasyuk.myshop.core.listeners;

/**
 * Created by Alex on 4/08/2018.
 */
public interface OnDatabaseOperationCompleteListener {
    void onSQLOperationFailed(String error);
    void onSQLOperationSucceded(String message);
}

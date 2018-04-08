package com.alextarasyuk.myshop.core.dagger;


import com.alextarasyuk.myshop.core.MainActivity;
import com.alextarasyuk.myshop.fragments.CheckoutFragment;
import com.alextarasyuk.myshop.fragments.CustomerListFragment;
import com.alextarasyuk.myshop.fragments.ProductListFragment;
import com.alextarasyuk.myshop.fragments.TransactionListFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Alex on 4/08/2018.
 */

@Singleton
@Component(
        modules = {
                AppModule.class,
                ShoppingCartModule.class,
                BusModule.class
        }
)
public interface AppComponent {
        void inject(ProductListFragment fragment);
        void inject(CustomerListFragment fragment);
        void inject(CheckoutFragment fragment);
        void inject(TransactionListFragment fragment);
        void inject(MainActivity activity);
}

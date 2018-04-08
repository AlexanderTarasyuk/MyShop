package com.alextarasyuk.myshop.core;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.alextarasyuk.myshop.R;
import com.alextarasyuk.myshop.core.events.CustomerSelectedEvent;
import com.alextarasyuk.myshop.core.events.OnCartItemsChangeEvent;
import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

import java.text.NumberFormat;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {





    @BindView(R.id.text_view_number_of_items) TextView mQtyTextView;
    @BindView(R.id.text_view_total_amount) TextView mTotalTextView;
    @BindView(R.id.text_view_customers_name) TextView mNameTextView;

    @BindView(R.id.toolbar)Toolbar mToolbar;
    @BindView(R.id.tabs) TabLayout tabLayout;
    @BindView(R.id.viewpager) ViewPager viewPager;
    private Bus mBus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        ProntoShopApplication.getInstance().getAppComponent().inject(this);
        mBus = ProntoShopApplication.getInstance().getBus();
        setupViewPager();

    }



    @Override
    protected void onResume() {
        super.onResume();
        try {
            mBus.register(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void setupViewPager(){
       ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
       viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
          mBus.unregister(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Subscribe
    public void onUpdateToolbar(OnCartItemsChangeEvent event){
        NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.getDefault());
        mTotalTextView.setText(fmt.format(event.getTotalAmount()));

        if (event.getNumberOfItems() > 1){
            mQtyTextView.setText(event.getNumberOfItems() + " items" );
        }else {
            mQtyTextView.setText(event.getNumberOfItems() + " item" );
        }
    }

    @Subscribe
    public void onCustomerSelected(CustomerSelectedEvent event){
        mNameTextView.setText(event.getCustomerName());
    }









}

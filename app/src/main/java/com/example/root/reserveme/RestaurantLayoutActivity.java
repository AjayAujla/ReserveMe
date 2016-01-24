package com.example.root.reserveme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RestaurantLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_layout);
    }

    public void switchToAllTablesLayout(View view) {
        Intent intent = new Intent(this, AllTablesActivity.class);
        this.startActivity(intent);
    }
}
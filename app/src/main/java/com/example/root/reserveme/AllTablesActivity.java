package com.example.root.reserveme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AllTablesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_tables);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton switchToRestaurantLayout = (FloatingActionButton) findViewById(R.id.switch_to_restaurant_layout);
        switchToRestaurantLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTablesActivity.this, RestaurantLayoutActivity.class);
                AllTablesActivity.this.startActivity(intent);
            }
        });
    }
}
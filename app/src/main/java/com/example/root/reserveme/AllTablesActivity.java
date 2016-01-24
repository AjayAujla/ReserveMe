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
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                AllTablesActivity.this.startActivity(intent);
            }
        });

        FloatingActionButton dummyButtonSwitchToTableDetails = (FloatingActionButton) findViewById(R.id.dummy_button_to_table_details);
        dummyButtonSwitchToTableDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllTablesActivity.this, ReserveTableActivity.class);
                //TODO: Send intent to TableDetailsActivity once res/layout/activity_table_details.xml is completed
                //Intent intent = new Intent(AllTablesActivity.this, TableDetailsActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                AllTablesActivity.this.startActivity(intent);
            }
        });
    }
}
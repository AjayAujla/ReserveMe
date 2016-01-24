package com.example.root.reserveme;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestaurantLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_layout);

        Button switchToRestaurantLayout = (Button) findViewById(R.id.button_restaurantLayout__viewTables);
        switchToRestaurantLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestaurantLayoutActivity.this, AllTablesActivity.class);
                RestaurantLayoutActivity.this.startActivity(intent);
            }
        });
    }

}

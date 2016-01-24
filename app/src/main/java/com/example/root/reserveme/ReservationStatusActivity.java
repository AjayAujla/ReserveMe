package com.example.root.reserveme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReservationStatusActivity extends AppCompatActivity {

    public final static String EXTRA_NAME = "com.reserveme.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_status);
    }

    public void shareReservationDetails(View view) {
        String name = this.getIntent().getStringExtra(EXTRA_NAME);

        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, this.getResources().getText(R.string.sharing_intent_subject));
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, this.getResources().getText(R.string.sharing_intent_body));
        this.startActivity(Intent.createChooser(sharingIntent, this.getResources().getText(R.string.sharing_intent)));
    }
}
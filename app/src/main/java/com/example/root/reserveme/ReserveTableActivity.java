package com.example.root.reserveme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class ReserveTableActivity extends AppCompatActivity {

    public final static String EXTRA_NAME = "com.reserveme.NAME";

    private EditText name;
    private EditText phoneNumber;
    private EditText emailAddress;
    private EditText requiredSeats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_table);

        this.name = (EditText) this.findViewById(R.id.name);
        this.phoneNumber = (EditText) this.findViewById(R.id.phone_number);
        this.emailAddress = (EditText) this.findViewById(R.id.email_address);
        this.requiredSeats = (EditText) this.findViewById(R.id.required_seats);
    }

    /**
     * Validates user's personal information prior to confirming the reservation
     * @param view
     */
    public void confirmReservation(View view) {
        boolean canConfirmReservation = true;
        if(this.name.getText().toString().trim().equals("")) {
            this.name.setError(this.getResources().getText(R.string.enter_name));
            canConfirmReservation = false;
        }
        if(this.phoneNumber.getText().toString().trim().equals("")) {
            this.phoneNumber.setError(this.getResources().getText(R.string.enter_phone_number));
            canConfirmReservation = false;
        }
        if(this.requiredSeats.getText().toString().trim().equals("")) {
            this.requiredSeats.setError(this.getResources().getText(R.string.enter_required_seats));
            canConfirmReservation = false;
        }
        if(canConfirmReservation) {
            Intent intent = new Intent(this, ReservationStatusActivity.class);
            intent.putExtra(EXTRA_NAME, this.name.getText().toString());
            this.startActivity(intent);
        }
    }

    /**
     * Returns application to TableDetailsActivity
     * @param view
     */
    public void cancelReservation(View view) {
        this.finish();
    }
}
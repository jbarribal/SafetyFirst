package com.example.safetyfirst;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DisasterPage extends AppCompatActivity {

    private Button btnEarthquake;
    private Button btnFire;
    private Button btnFlood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disaster_page);

        final Button btnEarthquake = (Button) findViewById(R.id.btnEarthquake);
        final Button btnFire       = (Button) findViewById(R.id.btnFire);
        final Button btnFlood      = (Button) findViewById(R.id.btnFlood);

        btnEarthquake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisasterPage.this, EarthquakeModule.class);
                startActivity(intent);
            }
        });


    }
}
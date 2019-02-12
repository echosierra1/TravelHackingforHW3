package com.example.travelhacking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onAddCardPress(View v)
    {
        Intent i = new Intent(this, Add_Card.class);
        this.startActivity(i);
    }
    public void onAddLoyaltyPress(View v)
    {
        Intent i = new Intent(this, Add_Loyalty.class);
        this.startActivity(i);
    }
}

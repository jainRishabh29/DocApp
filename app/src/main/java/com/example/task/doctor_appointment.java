package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class doctor_appointment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_appointment);
        CardView cardView = (CardView)findViewById(R.id.clickableCard);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),doctor_profile.class);
//                cardView.setCardBackgroundColor();
//                int color =cardView.getContext().getResources().getColor(R.color.black);
//                cardView.setCardBackgroundColor(color);
                startActivity(intent);
            }
        });
    }
}
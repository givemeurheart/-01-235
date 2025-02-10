package com.example.mdk0103;

import static androidx.core.content.ContextCompat.startActivity;

import static java.lang.Math.abs;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {
    private EditText vvodV1;
    private EditText vvodV2;
    private EditText vvodS;
    private EditText vvodT;
    private TextView Rez;
    private Button cal;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        vvodV1 = findViewById(R.id.editTextText4);
        vvodV2 = findViewById(R.id.editTextText2);
        vvodS = findViewById(R.id.editTextText5);
        vvodT = findViewById(R.id.editTextText3);
        Rez = findViewById(R.id.Result);
        cal = findViewById(R.id.calc);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1 = Double.parseDouble(vvodV1.getText().toString());
                double v2 = Double.parseDouble(vvodV2.getText().toString());
                double s = Double.parseDouble(vvodS.getText().toString());
                double t = Double.parseDouble(vvodT.getText().toString());
                double S2 = abs(s-t*(v1-v2));
                Rez.setText("S2= "+S2);






            }
            //S2=|S-T·(V1+V2)|
        });
    }

    public void taskThree(View view) {
        Intent intent = new Intent(MainActivity4.this, MainActivity.class);
        startActivity(intent);
    }
}
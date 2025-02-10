package com.example.mdk0103;

import static androidx.core.content.ContextCompat.startActivity;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

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

public class MainActivity2 extends AppCompatActivity {
    private EditText vvodA;
    private EditText vvodB;
    private EditText vvodC;
    private TextView Rez;
    private Button cal;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        vvodA = findViewById(R.id.editTextText4);
        vvodB = findViewById(R.id.editTextText2);
        Rez = findViewById(R.id.Result);
        cal = findViewById(R.id.calc);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(vvodA.getText().toString());
                int b = Integer.parseInt(vvodB.getText().toString());
                double S = a * b;
                double P = 2 * (a+b);

                 Rez.setText("Площадь: "+S+("Периметр: ")+P);
                }

        });
    }


    public void taskOne (View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }
}
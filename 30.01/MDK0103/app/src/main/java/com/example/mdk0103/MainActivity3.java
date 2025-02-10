package com.example.mdk0103;

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

public class MainActivity3 extends AppCompatActivity {
    private EditText vvodX1;
    private EditText vvodX2;
    private TextView Rez;
    private Button cal;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        vvodX1 = findViewById(R.id.editTextText2);
        vvodX2 = findViewById(R.id.editTextText3);
        Rez = findViewById(R.id.Result);
        cal = findViewById(R.id.calc);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x1 = Integer.parseInt(vvodX1.getText().toString());
                int x2 = Integer.parseInt(vvodX2.getText().toString());
                Rez.setText("Расстояние = " +(abs(x2-x1)));


            }
        });
    }

    public void taskTwo(View view) {
        Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
        startActivity(intent);
    }
}
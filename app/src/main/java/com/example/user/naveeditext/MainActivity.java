
package com.example.user.naveeditext.;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn23;
    String st;
    EditText edt23;
    TextView txv23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn23 = findViewById(R.id.btn23);
        edt23 = findViewById(R.id.edt23);
        txv23 = findViewById(R.id.txv23);
    }

    public void click(View view) {
        String st = edt23.getText().toString();
        txv23.setTextColor(Color.BLUE);
        txv23.setTextSize(65);
        txv23.setBackgroundColor(Color.RED);
        txv23.setText(st);
    }
}
package com.example.ayush.appproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eta;
    Button btna, btnb;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eta= (EditText) findViewById(R.id.et);
        btna=findViewById(R.id.btn1);
        btnb=findViewById(R.id.btn2);
        tv=findViewById(R.id.tv1);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = eta.getText().toString();
                Toast.makeText(getBaseContext(),s,Toast.LENGTH_SHORT).show();
            }
        });

      btnb.setOnClickListener(new View.OnClickListener() {
            @Override
          public void onClick(View v) {
                tv.setText(eta.getText().toString());
            }
       });
    }
}

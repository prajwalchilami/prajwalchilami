package com.example.imagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rd1,rd2,rd3;
    Button btn;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton rd1=(RadioButton) findViewById(R.id.rd1);
        RadioButton rd2=(RadioButton) findViewById(R.id.rd2);
        RadioButton rd3=(RadioButton) findViewById(R.id.rd3);
        TextView txt1=(TextView)findViewById(R.id.txt1);
        Button btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rdbx1=rd1.getText().toString();
                String rdbx2=rd2.getText().toString();
                String rdbx3=rd3.getText().toString();

                if (rd1.isChecked() && rd2.isChecked() && rd3.isChecked())
                {
                    txt1.setText("Selected"+rdbx1+" "+rdbx2+" "+rdbx3);
                }
                if (rd1.isChecked())
                {
                    txt1.setText("checked"+rdbx1);
                }
                if (rd2.isChecked())
                {
                    txt1.setText("checked"+rdbx2);
                }
                if (rd3.isChecked())
                {
                    txt1.setText("checked"+rdbx3);
                }
            }
        });


    }
}
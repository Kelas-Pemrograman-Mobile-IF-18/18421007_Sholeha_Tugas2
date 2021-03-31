package com.sholeha.prj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txttampil;
    EditText edtnpm, edtnama, edtjenis, edtnotelp;
    Button btnsub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txttampil = (TextView) findViewById(R.id.txttampil);
        edtnama = (EditText) findViewById(R.id.edtnama);
        edtnpm = (EditText) findViewById(R.id.edtnpm);
        edtjenis = (EditText) findViewById(R.id.edtjenis);
        edtnotelp = (EditText) findViewById(R.id.edtnotelp);
        btnsub = (Button) findViewById(R.id.btnsubmit);

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnama = edtnama.getText().toString();
                String strnpm = edtnpm.getText().toString();
                String jenis = edtjenis.getText().toString();
                String strnotelp = edtnotelp.getText().toString();

                txttampil.setText(strnama + "\n" + strnpm + "\n" + jenis + "\n" + strnotelp);
            }
        });
    }
}
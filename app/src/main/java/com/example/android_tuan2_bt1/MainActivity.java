package com.example.android_tuan2_bt1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText a,b;
    Button tong,hieu,tich,thuong,ucln,thoat;
    TextView kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.txta);
        b= findViewById(R.id.txtb);
        tong = findViewById(R.id.btntong);
        hieu = findViewById(R.id.btnhieu);
        tich = findViewById(R.id.btntich);
        thuong = findViewById(R.id.btnthuong);
        ucln = findViewById(R.id.btnucln);
        thoat = findViewById(R.id.btnthoat);
        kq = findViewById(R.id.viewkq);

        tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa = Integer.parseInt(a.getText().toString());
                int sob = Integer.parseInt(b.getText().toString());
                kq.setText("Tổng 2 số: "+ (soa+sob));
            }
        });

        hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa = Integer.parseInt(a.getText().toString());
                int sob = Integer.parseInt(b.getText().toString());
                kq.setText("Hiệu 2 số: "+ (soa-sob));
            }
        });
        tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa = Integer.parseInt(a.getText().toString());
                int sob = Integer.parseInt(b.getText().toString());
                kq.setText("Tích 2 số: "+ (soa*sob));
            }
        });
        thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa = Integer.parseInt(a.getText().toString());
                int sob = Integer.parseInt(b.getText().toString());
                kq.setText("Thương 2 số: "+ (soa/sob));
            }
        });
        ucln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa = Integer.parseInt(a.getText().toString());
                int sob = Integer.parseInt(b.getText().toString());

                while (soa!=sob){
                    if(soa>sob){
                        soa-=sob;
                    }else{
                        sob-=soa;
                    }
                }
                int uscln = soa;
                kq.setText("Ước chung lớn nhất : "+ uscln);
            }

        });
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

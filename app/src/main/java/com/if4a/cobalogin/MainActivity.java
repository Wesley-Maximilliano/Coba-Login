package com.if4a.cobalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvSesi;
    private Button btnLogout;
    KendaliLogin KL = new KendaliLogin();
    public static String keySPusername = "GtPJAx45lMjkuICbExYelQ==_username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(KL.isLogin(MainActivity.this, keySPusername)== true) {
            setContentView(R.layout.activity_main);


            tvSesi = findViewById(R.id.tv_sesi);
            btnLogout = findViewById(R.id.btn_logout);
        }
        else {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        }
    }
}
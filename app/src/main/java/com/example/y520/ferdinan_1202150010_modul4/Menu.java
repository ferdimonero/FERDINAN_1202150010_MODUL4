package com.example.y520.ferdinan_1202150010_modul4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Y520 on 3/18/2018.
 */

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Nama(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void Gambar(View view) {
        Intent intent = new Intent(this, Gambar.class);
        startActivity(intent);
    }
}


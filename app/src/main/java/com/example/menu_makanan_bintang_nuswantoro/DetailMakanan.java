package com.example.menu_makanan_bintang_nuswantoro;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailMakanan extends AppCompatActivity {

    ImageView img_gambarp;
    TextView txt_namap, txt_hargap, txt_descp;

    String namaMakanan, deskripsi, harga;
    int foto;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        txt_namap = findViewById(R.id.txt_namap);
        txt_descp = findViewById(R.id.txt_descp);
        txt_hargap = findViewById(R.id.txt_hargap);
        img_gambarp = findViewById(R.id.img_gambarp);

        // foto makanan
        Bundle bundle =  getIntent().getExtras();
        foto = bundle.getInt(String.valueOf("foto"));
        img_gambarp.setImageResource(foto);

        getInputExtra();
    }

    private void getInputExtra() {

        namaMakanan = getIntent().getStringExtra("nama");
        deskripsi = getIntent().getStringExtra("deskripsi");
        harga = getIntent().getStringExtra("harga");

        setDataActivity(namaMakanan, deskripsi, harga);
    }

    private void setDataActivity(String namaMakanan, String deskripsi, String harga){
        txt_namap.setText(namaMakanan);
        txt_descp.setText(deskripsi);
        txt_hargap.setText(harga);

    }

}
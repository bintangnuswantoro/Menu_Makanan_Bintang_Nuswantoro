package com.example.menu_makanan_bintang_nuswantoro;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec_Makanan;
    private ArrayList <Kuliner> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        // memanggil class KulinerAdapter agar menu muncul
        rec_Makanan.setAdapter(new KulinerAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Kuliner("Pecel Lele",
                "Rp. 15.000",
                "Pecel lele dengan sambel khas dari lamongan ",
                R.drawable.pecellele));

        listMakanan.add(new Kuliner("Nasi Goreng Mercon",
                "Rp. 14.500",
                "Nasi goreng mercon merupakan nasi goreng yang sangat pedas mencapai level 10 (bisa pilih level kepedasan)",
                R.drawable.nasigorengmercon));

        listMakanan.add(new Kuliner("Ayam Geprek Keju",
                "Rp. 20.000",
                "Ayam geprek dengan keju mozzarella yang membuat lebih nikmat saat dimakan dengan nasi",
                R.drawable.ayamgeprekkeju));
        listMakanan.add(new Kuliner("Kari Ayam",
                "Rp. 17.500",
                "Ayam bumbu kari khas jepang yang merupakan best saller ini memiliki rasa yang khas dari jepang",
                R.drawable.kariayam));
        listMakanan.add(new Kuliner("Tahu Bulat",
                "Rp. 500",
                "Tahu bulat yang gurih dan cocok buat snacking atau buat lalapan",
                R.drawable.tahubulat));
        listMakanan.add(new Kuliner("Salad Buah",
                "Rp. 12.000",
                "Salad buah dengan berbagai macam buah-buahan dan sayuran yang segar",
                R.drawable.saladbuah));
    }


}
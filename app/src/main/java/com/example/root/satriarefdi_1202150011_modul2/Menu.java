package com.example.root.satriarefdi_1202150011_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("birthday");
            foods.add("Cake blackforest");
            foods.add("Cake chocolate");
            foods.add("Cake Gulung keju");
            foods.add("Cake Gulung Strawberry");
            foods.add("Cake keju");
            foods.add("Cake oreo");
            foods.add("Cake rainbow");
            foods.add("Cake Tiramisu");

            // mamanggil harga
            priceses.add(150000);
            priceses.add(70000);
            priceses.add(50000);
            priceses.add(35000);
            priceses.add(35000);
            priceses.add(50000);
            priceses.add(60000);
            priceses.add(70000);
            priceses.add(60000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.birthday );
            photos.add(R.drawable.blackforest );
            photos.add(R.drawable.chocolate );
            photos.add(R.drawable.gulungkeju );
            photos.add(R.drawable.gulungstrawberry );
            photos.add(R.drawable.keju );
            photos.add(R.drawable.oreo );
            photos.add(R.drawable.rainbow );
            photos.add(R.drawable.tiramissu );
        }
    }
}

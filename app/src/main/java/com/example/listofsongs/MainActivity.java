package com.example.listofsongs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements clickListener {
    private RecyclerView recycle;
    private ArrayList<Songs> songslist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        buildlist();
        setRecyclerview();
    }

    private void initviews() {
        recycle=findViewById(R.id.recycler);
    }

    private void buildlist() {
        Songs song1=new Songs("Siddhu Mussewala-Bad",R.drawable.badimg,R.raw.bad);
        songslist.add(song1);
        Songs song2=new Songs("Siddhu Mussewala-Legend",R.drawable.legendimg,R.raw.legend);
        songslist.add(song2);
        Songs song3=new Songs("Siddhu Mussewala-Dawood",R.drawable.dawooding,R.raw.dawood);
        songslist.add(song3);
        Songs song4=new Songs("Siddhu Mussewala-Same Beef",R.drawable.beefimg,R.raw.same);
        songslist.add(song4);
        Songs song5=new Songs("Siddhu Mussewala-famous",R.drawable.famous,R.raw.famous);
        songslist.add(song5);
        Songs song6=new Songs("Diljeet-G.O.A.T.",R.drawable.goatimg,R.raw.goat);
        songslist.add(song6);
        Songs song7=new Songs("Siddhu Mussewala-libaas",R.drawable.libaasimg,R.raw.libaas);
        songslist.add(song7);
        Songs song8=new Songs("Siddhu Mussewala-order",R.drawable.orderimg,R.raw.shoot);
        songslist.add(song8);
        Songs song9=new Songs("Simran maan-Sira",R.drawable.siraimg,R.raw.sira);
        songslist.add(song9);
    }
    private void setRecyclerview() {
        SongAdapter songAdapter=new SongAdapter(songslist,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recycle.setLayoutManager(linearLayoutManager);
        recycle.setAdapter(songAdapter);
    }

    @Override
    public void itemclicked(int position, Songs songs) {
        Intent intent=new Intent(MainActivity.this,PlayMusic.class);
        intent.putExtra("name",songs.getName());
        intent.putExtra("image",songs.getImage());
        intent.putExtra("music",songs.getMusicpath());
        startActivity(intent);

    }
}
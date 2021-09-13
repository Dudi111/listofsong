package com.example.listofsongs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayMusic extends AppCompatActivity {
    private ImageView image;
    private TextView txtmu;
    private Button mbtnstart;
    private Button mbtnplay;
    private Button mbtnpause;
    private Button mbtnstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);
        Intent intent=getIntent();
        image.setImageResource(intent.getIntExtra("image",0));
        txtmu.setText(intent.getStringExtra("name"));
        int Music=intent.getIntExtra("music",0);
    }

    private void initiviews() {
        image=findViewById(R.id.ivplayimg);
        txtmu=findViewById(R.id.tvplaytxt);
        mbtnstart=findViewById(R.id.btnstart);
        mbtnplay=findViewById(R.id.btnplay);
        mbtnpause=findViewById(R.id.btnpause);
        mbtnstop=findViewById(R.id.btnstop);
    }
}
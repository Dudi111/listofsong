package com.example.listofsongs;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SongviewHolder extends RecyclerView.ViewHolder {
    private TextView tvview;
    private ImageView image;
    private RelativeLayout relative;
    private clickListener clicklistener;


    public SongviewHolder(@NonNull View itemView, clickListener clicklistener) {
        super(itemView);
        this.clicklistener=clicklistener;
        initview(itemView);
    }

    private void initview(View itemView) {
        image=itemView.findViewById(R.id.ivimages);
        tvview=itemView.findViewById(R.id.songName);
        relative=itemView.findViewById(R.id.rel);
    }
    public void setdata(Songs songs){
        tvview.setText(songs.getName());
        image.setImageResource(songs.getImage());
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicklistener.itemclicked(getAdapterPosition(),songs);
            }
        });
    }
}

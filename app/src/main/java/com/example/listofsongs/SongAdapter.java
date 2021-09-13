package com.example.listofsongs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongviewHolder> {
    private ArrayList<Songs> songslist;
    private clickListener clicklistener;

    public SongAdapter(ArrayList<Songs> songslist,clickListener clicklistener) {
        this.songslist = songslist;
        this.clicklistener=clicklistener;
    }

    @NonNull
    @Override
    public SongviewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new SongviewHolder(view,clicklistener);
    }

    @Override
    public void onBindViewHolder(@NonNull  SongviewHolder holder, int position) {
        Songs songs=songslist.get(position);
         holder.setdata(songs);
    }

    @Override
    public int getItemCount() {
        return songslist.size();
    }
}

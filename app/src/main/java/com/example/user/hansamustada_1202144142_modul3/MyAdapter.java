package com.example.user.hansamustada_1202144142_modul3;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{


    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        public static TextView Merek;
        public static TextView Desc;
        public static ImageView logoID;

        ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            Merek = (TextView)itemView.findViewById(R.id.merekProduct);
            Desc = (TextView)itemView.findViewById(R.id.descProduct);
            logoID = (ImageView)itemView.findViewById(R.id.logoID);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        ViewHolder.Merek.setText(Items.get(i).merek);
        ViewHolder.Desc.setText(Items.get(i).desc);
        ViewHolder.logoID.setImageResource(Items.get(i).logoID);
    }

    //panggil array nya lagi
    List<ListItem> Items;

    MyAdapter(List<ListItem> Items){
        this.Items = Items;
    }
    @Override
    public int getItemCount() {

        return Items.size();
    }
}
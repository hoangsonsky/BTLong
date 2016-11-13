package com.example.hoangson.btlong;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;


import java.util.ArrayList;

/**
 * Created by MyPC on 31/07/2016.
 */
public class RecycleAdapter extends RecyclerView.Adapter<MyViewHoder> {
    ArrayList<Entity> arrayList = new ArrayList<>();
    Context mContext;


    public RecycleAdapter(ArrayList<Entity> arrayList, Activity mContext) {
        this.arrayList = arrayList;
        this.mContext = mContext;

    }

    @Override
    public MyViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_layout,null);
        return new MyViewHoder(view);
    }


    @Override
    public void onBindViewHolder(MyViewHoder holder, final int position) {
        holder.tvItem.setText(arrayList.get(position).getText());
        holder.imgItem.setImageResource(arrayList.get(position).getImg());

    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}


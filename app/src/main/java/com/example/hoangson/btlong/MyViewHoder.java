package com.example.hoangson.btlong;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by HoangSon on 11/13/2016.
 */
public class MyViewHoder extends RecyclerView.ViewHolder {
    public ImageView imgItem;
    public TextView tvItem;
    public MyViewHoder(View itemView) {
        super(itemView);
        tvItem = (TextView) itemView.findViewById(R.id.tvItem);
        imgItem = (ImageView) itemView.findViewById(R.id.imgItem);
    }
}

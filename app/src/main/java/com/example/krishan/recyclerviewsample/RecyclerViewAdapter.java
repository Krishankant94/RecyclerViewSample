package com.example.krishan.recyclerviewsample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    String[] TimeValues,TempValues;
    Context context;
    View view1;
    ViewHolder viewHolder1;
    TextView textView;

    public RecyclerViewAdapter(Context context,String[] TimeValues){
        this.TimeValues = TimeValues;
        this.TempValues = TempValues;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tv_time,tv_temp;
        public ImageView img_icon_small;
        public ViewHolder(View v){

            super(v);

            tv_time = (TextView)v.findViewById(R.id.time_value_for_nexthour);
            tv_temp = (TextView)v.findViewById(R.id.temp_nexthour);
            img_icon_small = (ImageView)v.findViewById(R.id.small_icon_nexthour);
        }
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        view1 = LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false);

        viewHolder1 = new ViewHolder(view1);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){

        holder.tv_time.setText(TimeValues[position]);
    }

    @Override
    public int getItemCount(){

        return TimeValues.length;
    }
}
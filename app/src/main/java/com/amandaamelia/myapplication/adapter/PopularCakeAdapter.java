package com.amandaamelia.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amandaamelia.myapplication.DetailsProduct;
import com.amandaamelia.myapplication.R;
import com.amandaamelia.myapplication.model.PopularCake;

import java.util.List;


public class PopularCakeAdapter extends RecyclerView.Adapter<PopularCakeAdapter.PopularCakeViewHolder> {

    Context context;
    List<PopularCake> popularCakeList;



    public PopularCakeAdapter(Context context, List<PopularCake> popularCakeList) {
        this.context = context;
        this.popularCakeList = popularCakeList;
    }

    @NonNull
    @Override
    public PopularCakeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.popular_cake_row_item, parent, false);
        return new PopularCakeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularCakeViewHolder holder, int position) {

        holder.foodImage.setImageResource(popularCakeList.get(position).getImageUrl());
        holder.name.setText(popularCakeList.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailsProduct.class);
                i.putExtra("name", popularCakeList.get(position).getName());
                i.putExtra("image", popularCakeList.get(position).getImageUrl());
                i.putExtra("desc", popularCakeList.get(position).getDesc());
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return popularCakeList.size();
    }


    public static final class PopularCakeViewHolder extends RecyclerView.ViewHolder{


        ImageView foodImage;
        TextView name;

        public PopularCakeViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            name = itemView.findViewById(R.id.name);



        }
    }

}

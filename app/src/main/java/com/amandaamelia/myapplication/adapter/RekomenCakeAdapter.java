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
import com.amandaamelia.myapplication.model.RekomenCake;

import java.util.List;


public class RekomenCakeAdapter extends RecyclerView.Adapter<RekomenCakeAdapter.RekomenCakeViewHolder> {

    Context context;
    List<RekomenCake> rekomenCakeList;



    public RekomenCakeAdapter(Context context, List<RekomenCake> rekomenCakeList) {
        this.context = context;
        this.rekomenCakeList = rekomenCakeList;
    }

    @NonNull
    @Override
    public RekomenCakeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.rekomen_cake_row_item, parent, false);
        return new RekomenCakeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RekomenCakeViewHolder holder, int position) {

        holder.foodImage.setImageResource(rekomenCakeList.get(position).getImageUrl());
        holder.name.setText(rekomenCakeList.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailsProduct.class);
                i.putExtra("name", rekomenCakeList.get(position).getName());
                i.putExtra("image", rekomenCakeList.get(position).getImageUrl());
                i.putExtra("desc", rekomenCakeList.get(position).getDesc());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return rekomenCakeList.size();
    }


    public static final class RekomenCakeViewHolder extends RecyclerView.ViewHolder{


        ImageView foodImage;
        TextView name;

        public RekomenCakeViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            name = itemView.findViewById(R.id.name);



        }
    }

}

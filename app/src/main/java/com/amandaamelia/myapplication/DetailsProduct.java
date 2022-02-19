package com.amandaamelia.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsProduct extends AppCompatActivity {

    ImageView img, back2, share;
    TextView proName, proDesc;

    String name, desc;
    int image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_product);

        Intent i = getIntent();

        name = i.getStringExtra("name");
        image = i.getIntExtra("image", R.drawable.rcane1);
        desc = i.getStringExtra("desc");


        proName = findViewById(R.id.productName);
        proDesc = findViewById(R.id.prodDesc);
        img = findViewById(R.id.big_image);
        back2 = findViewById(R.id.back2);
        share = findViewById(R.id.share);

        proName.setText(name);
        proDesc.setText(desc);


        img.setImageResource(image);


        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DetailsProduct.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sharingIntent = new Intent();
                sharingIntent.setAction(Intent.ACTION_SEND);
                sharingIntent.putExtra(Intent.EXTRA_TEXT, proName.getText().toString());
                sharingIntent.putExtra(Intent.EXTRA_TEXT, proDesc.getText().toString());
                sharingIntent.setType("text/plain");
                sharingIntent = Intent.createChooser(sharingIntent, "Share Via: ");

                startActivity(sharingIntent);

            }
        });

    }
}
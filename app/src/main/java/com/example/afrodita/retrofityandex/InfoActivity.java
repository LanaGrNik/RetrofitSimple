package com.example.afrodita.retrofityandex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.example.afrodita.retrofityandex.MainActivity.ARTIST;

public class InfoActivity extends AppCompatActivity {

    ImageView imageView;
    TextView txt ;
    TextView description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Item item = (Item) getIntent().getSerializableExtra(ARTIST);
        imageView = (ImageView)findViewById(R.id.image);
        txt= (TextView)findViewById(R.id.text);
        description = (TextView)findViewById(R.id.description);

        txt.setText(item.getName());
        description.setText(item.getDescription());
        Picasso.with(this)
                .load(item.getCover().big)
                .into(imageView);


    }
}

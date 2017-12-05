package com.example.afrodita.retrofityandex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<List<Item>> {
    public static final String ARTIST = "artist_name";
    public APIService apiService;

    TextView txv;
    private ArrayAdapter<Item> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txv = (TextView) findViewById(R.id.text);

        adapter = new ArrayAdapter<Item>(this, android.R.layout.simple_list_item_1);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              Item item = adapter.getItem(i);
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                intent.putExtra(ARTIST, item);
                startActivity(intent);
            }
        });

        ApiController apiController = new ApiController(this);
        apiController.getArtists();


    }

    @Override
    public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
        List<Item> items = response.body();

        adapter.addAll(items);

    }

    @Override
    public void onFailure(Call<List<Item>> call, Throwable t) {
        t.printStackTrace();

    }
}

package com.example.afrodita.retrofityandex;

import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Afrodita on 05.12.2017.
 */

public class ApiController {


    APIService apiService;
    Callback<List<Item>> callback;

    ApiController(Callback<List<Item>> callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://download.cdn.yandex.net/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(APIService.class);
        this.callback = callback;
    }


    public void getArtists() {
        final Call<List<Item>> repos = apiService.artists();
        repos.enqueue(callback);
    }
}

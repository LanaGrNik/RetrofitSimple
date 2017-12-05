package com.example.afrodita.retrofityandex;

import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Afrodita on 04.12.2017.
 */

public interface APIService {

    @GET("mobilization-2016/artists.json")
    Call<List<Item>> artists();


}

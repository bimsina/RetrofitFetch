package com.example.timsi.superheroes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String baseUrl = "https://simplifiedcoding.net/demos/";
    @GET("marvel")
    Call<List<Hero>> getHeroes();
}

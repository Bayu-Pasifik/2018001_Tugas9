package com.example.tugas3;

import retrofit2.Call;
import retrofit2.http.GET;

 interface Api {
    String BASE_URL = "https://api-blue-archive.vercel.app/api/";
    @GET("characters")
    Call<PojoResponse> getStudent();
}

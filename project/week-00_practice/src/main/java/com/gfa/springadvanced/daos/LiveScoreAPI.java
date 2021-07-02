package com.gfa.springadvanced.daos;

import com.gfa.springadvanced.dtos.InputDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface LiveScoreAPI {

    @Headers({
        "x-rapidapi-key: 0b8349f53amsh56eb5801e05e4fep151a15jsna5b1eb552516",
        "x-rapidapi-host: livescore6.p.rapidapi.com"
    })
    @GET("matches/v2/list-by-league")
    Call<InputDTO> getEuro2020Data(@Query("Category") String category, @Query("Ccd") String ccd);
}

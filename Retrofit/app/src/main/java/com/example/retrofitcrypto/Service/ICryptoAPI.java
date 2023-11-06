package com.example.retrofitcrypto.Service;

import com.example.retrofitcrypto.Model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ICryptoAPI {

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json


    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Call<List<CryptoModel>> getData();
}

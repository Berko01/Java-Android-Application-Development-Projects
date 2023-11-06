package com.example.retrofitcrypto.Model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency")
    String currency;

    @SerializedName("price")
    String price;
}

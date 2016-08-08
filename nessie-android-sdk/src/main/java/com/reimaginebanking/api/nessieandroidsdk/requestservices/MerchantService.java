package com.reimaginebanking.api.nessieandroidsdk.requestservices;

import com.reimaginebanking.api.nessieandroidsdk.models.Merchant;
import com.reimaginebanking.api.nessieandroidsdk.models.RequestResponse;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Merchant endpoints
 */
public interface MerchantService {
    @GET("/merchants")
    void getMerchants(@Query("key") String key, Callback<List<Merchant>> cb);

    @GET("/merchants/{id}")
    void getMerchant(@Query("key") String key, @Path("id") String merchantId, Callback<Merchant> cb);

    @POST("/merchants")
    void createMerchant(@Query("key") String key, @Body Merchant merchant, Callback<RequestResponse> cb);

    @PUT("/merchants/{id}")
    void updateMerchant(@Query("key") String key, @Path("id") String merchantId, @Body Merchant merchant, Callback<RequestResponse> cb);
}
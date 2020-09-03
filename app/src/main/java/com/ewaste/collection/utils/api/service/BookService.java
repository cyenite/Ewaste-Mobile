package com.ewaste.collection.utils.api.service;

import com.ewaste.collection.json.CheckStatusTransaksiRequest;
import com.ewaste.collection.json.CheckStatusTransaksiResponse;
import com.ewaste.collection.json.DetailRequestJson;
import com.ewaste.collection.json.DetailTransResponseJson;
import com.ewaste.collection.json.GetNearRideCarRequestJson;
import com.ewaste.collection.json.GetNearRideCarResponseJson;
import com.ewaste.collection.json.ItemRequestJson;
import com.ewaste.collection.json.LokasiDriverRequest;
import com.ewaste.collection.json.LokasiDriverResponse;
import com.ewaste.collection.json.RideCarRequestJson;
import com.ewaste.collection.json.RideCarResponseJson;
import com.ewaste.collection.json.SendRequestJson;
import com.ewaste.collection.json.SendResponseJson;
import com.ewaste.collection.json.fcm.CancelBookRequestJson;
import com.ewaste.collection.json.fcm.CancelBookResponseJson;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/17/2019.
 */

public interface BookService {

    @POST("pelanggan/list_ride")
    Call<GetNearRideCarResponseJson> getNearRide(@Body GetNearRideCarRequestJson param);

    @POST("pelanggan/list_car")
    Call<GetNearRideCarResponseJson> getNearCar(@Body GetNearRideCarRequestJson param);

    @POST("pelanggan/request_transaksi")
    Call<RideCarResponseJson> requestTransaksi(@Body RideCarRequestJson param);

    @POST("pelanggan/inserttransaksimerchant")
    Call<RideCarResponseJson> requestTransaksiMerchant(@Body ItemRequestJson param);

    @POST("pelanggan/request_transaksi_send")
    Call<SendResponseJson> requestTransaksisend(@Body SendRequestJson param);

    @POST("pelanggan/check_status_transaksi")
    Call<CheckStatusTransaksiResponse> checkStatusTransaksi(@Body CheckStatusTransaksiRequest param);

    @POST("pelanggan/user_cancel")
    Call<CancelBookResponseJson> cancelOrder(@Body CancelBookRequestJson param);

    @POST("pelanggan/liat_lokasi_driver")
    Call<LokasiDriverResponse> liatLokasiDriver(@Body LokasiDriverRequest param);

    @POST("pelanggan/detail_transaksi")
    Call<DetailTransResponseJson> detailtrans(@Body DetailRequestJson param);


}

package com.ewaste.collection.utils.api.service;

import com.ewaste.collection.json.AllMerchantByNearResponseJson;
import com.ewaste.collection.json.AllMerchantbyCatRequestJson;
import com.ewaste.collection.json.AllTransResponseJson;
import com.ewaste.collection.json.BeritaDetailRequestJson;
import com.ewaste.collection.json.BeritaDetailResponseJson;
import com.ewaste.collection.json.ChangePassRequestJson;
import com.ewaste.collection.json.DetailRequestJson;
import com.ewaste.collection.json.EditprofileRequestJson;
import com.ewaste.collection.json.GetAllMerchantbyCatRequestJson;
import com.ewaste.collection.json.GetFiturResponseJson;
import com.ewaste.collection.json.GetHomeRequestJson;
import com.ewaste.collection.json.GetHomeResponseJson;
import com.ewaste.collection.json.GetMerchantbyCatRequestJson;
import com.ewaste.collection.json.LoginRequestJson;
import com.ewaste.collection.json.LoginResponseJson;
import com.ewaste.collection.json.MerchantByCatResponseJson;
import com.ewaste.collection.json.MerchantByIdResponseJson;
import com.ewaste.collection.json.MerchantByNearResponseJson;
import com.ewaste.collection.json.MerchantbyIdRequestJson;
import com.ewaste.collection.json.PrivacyRequestJson;
import com.ewaste.collection.json.PrivacyResponseJson;
import com.ewaste.collection.json.RateRequestJson;
import com.ewaste.collection.json.RateResponseJson;
import com.ewaste.collection.json.RegisterRequestJson;
import com.ewaste.collection.json.RegisterResponseJson;
import com.ewaste.collection.json.ResponseJson;
import com.ewaste.collection.json.SearchMerchantbyCatRequestJson;
import com.ewaste.collection.json.TopupRequestJson;
import com.ewaste.collection.json.TopupResponseJson;
import com.ewaste.collection.json.WalletRequestJson;
import com.ewaste.collection.json.WalletResponseJson;
import com.ewaste.collection.json.WithdrawRequestJson;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/13/2019.
 */

public interface UserService {

    @POST("pelanggan/login")
    Call<LoginResponseJson> login(@Body LoginRequestJson param);

    @POST("pelanggan/changepass")
    Call<LoginResponseJson> changepass(@Body ChangePassRequestJson param);

    @POST("pelanggan/register_user")
    Call<RegisterResponseJson> register(@Body RegisterRequestJson param);

    @GET("pelanggan/detail_fitur")
    Call<GetFiturResponseJson> getFitur();

    @POST("pelanggan/forgot")
    Call<LoginResponseJson> forgot(@Body LoginRequestJson param);

    @POST("pelanggan/privacy")
    Call<PrivacyResponseJson> privacy(@Body PrivacyRequestJson param);

    @POST("pelanggan/home")
    Call<GetHomeResponseJson> home(@Body GetHomeRequestJson param);

    @POST("pelanggan/topupstripe")
    Call<TopupResponseJson> topup(@Body TopupRequestJson param);

    @POST("pelanggan/withdraw")
    Call<ResponseJson> withdraw(@Body WithdrawRequestJson param);

    @POST("pelanggan/topuppaypal")
    Call<ResponseJson> topuppaypal(@Body WithdrawRequestJson param);

    @POST("pelanggan/rate_driver")
    Call<RateResponseJson> rateDriver(@Body RateRequestJson param);

    @POST("pelanggan/edit_profile")
    Call<RegisterResponseJson> editProfile(@Body EditprofileRequestJson param);

    @POST("pelanggan/wallet")
    Call<WalletResponseJson> wallet(@Body WalletRequestJson param);

    @POST("pelanggan/history_progress")
    Call<AllTransResponseJson> history(@Body DetailRequestJson param);

    @POST("pelanggan/detail_berita")
    Call<BeritaDetailResponseJson> beritadetail(@Body BeritaDetailRequestJson param);

    @POST("pelanggan/all_berita")
    Call<BeritaDetailResponseJson> allberita(@Body BeritaDetailRequestJson param);

    @POST("pelanggan/merchantbykategoripromo")
    Call<MerchantByCatResponseJson> getmerchanbycat(@Body GetMerchantbyCatRequestJson param);

    @POST("pelanggan/merchantbykategori")
    Call<MerchantByNearResponseJson> getmerchanbynear(@Body GetMerchantbyCatRequestJson param);

    @POST("pelanggan/allmerchantbykategori")
    Call<AllMerchantByNearResponseJson> getallmerchanbynear(@Body GetAllMerchantbyCatRequestJson param);

    @POST("pelanggan/itembykategori")
    Call<MerchantByIdResponseJson> getitembycat(@Body GetAllMerchantbyCatRequestJson param);

    @POST("pelanggan/searchmerchant")
    Call<AllMerchantByNearResponseJson> searchmerchant(@Body SearchMerchantbyCatRequestJson param);

    @POST("pelanggan/allmerchant")
    Call<AllMerchantByNearResponseJson> allmerchant(@Body AllMerchantbyCatRequestJson param);

    @POST("pelanggan/merchantbyid")
    Call<MerchantByIdResponseJson> merchantbyid(@Body MerchantbyIdRequestJson param);


}

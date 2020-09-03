package com.ewaste.collection.constants;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class Constants {

    public static final String BASE_URL = "http://ewaste.dekutrends.co.ke/";
    public static final String FCM_KEY = "AAAAHRNOuPk:APA91bEopNiJJkb3gyTwkgd_sc2PkbS8TaCc44lviQSw9hj2gPTeF_bVcZ7GTzgbh7ouh7MqDT1qRmuvYIFnO6uNK_T5E4KPqmtvOQy7ejp4e0bTqFGb2tFQ60RZhuRVSFZYy0NY49A4";
    public static final String CONNECTION = BASE_URL + "api/";
    public static final String IMAGESFITUR = BASE_URL + "images/fitur/";
    public static final String IMAGESMERCHANT = BASE_URL + "images/merchant/";
    public static final String IMAGESITEM = BASE_URL + "images/itemmerchant/";
    public static final String IMAGESBERITA = BASE_URL + "images/berita/";
    public static final String IMAGESSLIDER = BASE_URL + "images/promo/";
    public static final String IMAGESDRIVER = BASE_URL + "images/fotodriver/";
    public static final String IMAGESUSER = BASE_URL + "images/pelanggan/";
    public static String CURRENCY = "";

    public static final int REJECT = 0;
    public static final int ACCEPT = 2;
    public static final int CANCEL = 5;
    public static final int START = 3;
    public static final int FINISH = 4;

    public static Double LATITUDE;
    public static Double LONGITUDE;
    public static String LOCATION;

    public static String TOKEN = "token";

    public static String USERID = "uid";

    public static String PREF_NAME = "pref_name";

    public static int permission_camera_code = 786;
    public static int permission_write_data = 788;
    public static int permission_Read_data = 789;
    public static int permission_Recording_audio = 790;

    public static SimpleDateFormat df =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
    public static String versionname = "1.0";

    public static final LatLngBounds BOUNDS = new LatLngBounds(
            new LatLng(-7.216001, 0), // southwest
            new LatLng(0, 107.903316)); // northeast

}

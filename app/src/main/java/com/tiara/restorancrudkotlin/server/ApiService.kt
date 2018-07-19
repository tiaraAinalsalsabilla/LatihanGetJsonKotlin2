package com.tiara.restorancrudkotlin.server

import com.tiara.restorancrudkotlin.response.ResponseInsert
import com.tiara.restorancrudkotlin.response.ResponseItem
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
 //ini namanya konfigurasi
interface ApiService {

    //@ -? annotation

    //in harus ada kalau seandainya method url adalah post
    @FormUrlEncoded // fungsinya karena kita pakai post dia yg nyembunyiinnya
    @POST("insertMakanan") // jadi ini dari mana kita mau post
    fun requestInsert (@Field("name")nama : String,
                       @Field("price")harga :String,
                       @Field("restoran")restoran : String) : Call<ResponseInsert>

    @GET("youtube/v3/search?part=snippet&maxResults=25&q=surfing&key=AIzaSyAwlUiPDgc1CmRo4BdL-LQMFbemR55A9tQ")
    fun requestGetMakanan():Call<ResponseItem>
}


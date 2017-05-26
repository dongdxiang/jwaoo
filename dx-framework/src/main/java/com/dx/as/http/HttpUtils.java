package com.dx.as.http;

import com.google.gson.Gson;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jwaoo on 2017/5/25.
 */

public class HttpUtils {
//    private static Retrofit retrofit ;
//    private static LocalService localService;
//    private static Gson gson;
//
//
//
//    public static LocalService getRetrofit(){
//        if (retrofit == null){
//            retrofit = new Retrofit.Builder()
//                    .baseUrl("http://s-338727.gotocdn.com/")
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//            localService = CommonUtils.getRetrofit().create(LocalService.class);
//            gson = new Gson();
//        }
//        return localService;
//    }
//
//    public static void doNet(final IHttpDao listener){
//        Call<ResponseBody> call = (Call<ResponseBody>)getRetrofit().listRepos();
//        call.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                if (response != null ){
//                    try {
//                        String body = response.body().string();
//                        listener.onResponse(body);
//                    }catch (Exception ex){
//                        ex.printStackTrace();
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//                if (t != null ){
//                    t = null;
//                }
//                //网络请求失败时总的处理方法
//            }
//        });
//    }

}

package com.dx.as.common;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jwaoo on 2017/5/25.
 */

public class CommonUtils {
    private static Retrofit retrofit ;

    public static Retrofit getRetrofit(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://s-338727.gotocdn.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static void handerMsg(String code,String msg){
        if (!("200".equals(code) || "304".equals(code))){
            //抛出错误信息
        }
    }
}

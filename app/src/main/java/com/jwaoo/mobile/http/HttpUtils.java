package com.jwaoo.mobile.http;

import com.dx.as.common.IHttpDao;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by jwaoo on 2017/5/25.
 */

public class HttpUtils {

    public static void doNet(Call call ,final IHttpDao listener){
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response != null && response.isSuccessful()){
                    try {
                        String body = response.body().string();
                        listener.onResponse(body,call.hashCode());
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                }else{
                    //统一的错误处理
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                if (call != null && !call.isCanceled()){
                    listener.onFailure(t);
                }
                //网络请求失败时总的处理方法
            }
        });
    }

}

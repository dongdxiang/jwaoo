package com.jwaoo.mobile.data;

import com.dx.as.common.CommonUtils;
import com.dx.as.common.IHttpDao;
import com.dx.as.common.ILoadListener;
import com.dx.as.common.JWResult;
import com.dx.as.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jwaoo.mobile.http.HttpUtils;
import retrofit2.Call;

/**
 * Created by jwaoo on 2017/5/26.
 */

public class DataDao implements IHttpDao {

    private static DataDao dao;
    private static ILoadListener listener;
    private static Gson gson;
    private static LocalService localService;

    private DataDao(){
    }
    public static DataDao getInit(ILoadListener loadListener){
        if (dao == null){
            dao = new DataDao();
            listener = loadListener;
            gson = new Gson();
            localService = CommonUtils.getRetrofit().create(LocalService.class);
        }
        return dao;
    }

    public void getInfo(){
        doNet();
    }

    @Override
    public void onResponse(String response , int flg) {
        if (!Utils.isEmpty(response)){
            JWResult<Storys> baseEntity = gson.fromJson(response, new TypeToken<JWResult<Storys>>(){}.getType());
            listener.onResponse(baseEntity.getResult(),flg);
        }
    }

    @Override
    public void onFailure(Throwable t) {
        listener.onFailure(t);
    }

    public void doNet(){
        Call call = localService.listRepos();
        HttpUtils.doNet(call,this);
        call.cancel();
    }

}

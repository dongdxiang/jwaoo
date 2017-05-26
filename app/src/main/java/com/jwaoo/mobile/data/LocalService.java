package com.jwaoo.mobile.data;

import com.dx.as.common.JWResult;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jwaoo on 2017/5/25.
 */

public interface LocalService{
    @GET("api/storys")
    Call<ResponseBody> listRepos();
    @GET("api/storys/{category }/{id}")
    Call<JWResult<Storys>> getInfo(@Path("category") int category, @Path("id") String id);
    //@GET("repos/{owner}/{repo}/contributors")
    //Call<ResponseBody> contributorsBySimpleGetCall(@Path("owner") String owner, @P
}

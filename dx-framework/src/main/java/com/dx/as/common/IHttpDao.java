package com.dx.as.common;

/**
 * Created by jwaoo on 2017/5/26.
 */

public interface IHttpDao {
    void onResponse(String response, int flg);
    void onFailure(Throwable t);
}

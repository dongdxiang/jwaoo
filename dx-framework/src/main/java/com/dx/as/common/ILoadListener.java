package com.dx.as.common;

/**
 * Created by jwaoo on 2017/5/25.
 */

public interface ILoadListener <T>{
    void onResponse(T response, int flg);
    void onFailure(Throwable t);
}

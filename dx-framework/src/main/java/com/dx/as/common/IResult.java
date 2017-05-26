package com.dx.as.common;

/**
 * Created by jwaoo on 2017/5/25.
 */

public interface IResult<T> {
    String status_code();
    String message();
    T getResult();
}

package com.dx.as.common;

/**
 * Created by jwaoo on 2017/5/25.
 */

public class JWResult<T> implements IResult<T>{

    private String status_code;
    private String message;
    private T result;

    @Override
    public String status_code() {
        return null;
    }

    @Override
    public String message() {
        return null;
    }

    @Override
    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus_code() {
        return status_code;
    }

    public String getMessage() {
        return message;
    }

}

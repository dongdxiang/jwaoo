package com.dx.as.utils;

/**
 * Created by jwaoo on 2017/5/26.
 */

public class Utils {
    public static boolean isEmpty(Object object){
        if (object == null) return true;
        if (object.toString().trim().length() == 0 || "null".equals(object.toString().trim().toLowerCase())) return true;
        return false;
    }
}

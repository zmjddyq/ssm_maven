package com.ssm_02.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zmj
 * @date 2020/5/15 9:13
 * @Description
 */
public class DateUtil {

    public static Date DateFormat(String date){
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = simpleDateFormat.parse(date);
            return new Date(parse.getTime());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

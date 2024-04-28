package com.edusys.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class XDate {
    static SimpleDateFormat formater = new SimpleDateFormat();
    
    public static Date toDate(String date, String pattern){ //Chuyển từ chuỗi sang ngày
        /*String s = "01-09-1971";
          Date date = XDate.toDate(s,"dd-MM-yyyy");*/
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static String toString(Date date, String pattern){ //Chuyển từ ngày sang chuỗi
        /*Date now = new Date();
          String s = XDate.toString(now,"dd-MM-yyyy");*/
        formater.applyPattern(pattern);
        return formater.format(date);
    }
    
    public static Date addDays(Date date, long days){
        /*Date now = new Date();
          Date after = XDate.addDays(s, 10);*/
        date.setTime(date.getTime() + days*24*60*60*1000);
        return date;
    }
}

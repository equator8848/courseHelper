package com.equator.course.service.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    /**
     * 以时间对象格式返回pattern格式的时间，若pattern为null，返回格式为yyyy-MM-dd hh:mm:ss
     *
     * @param pattern
     * @return
     */
    public static Date getFormatDateDefault(String pattern) {
        if (pattern == null) {
            pattern = "yyyy-MM-dd HH:mm:ss";
        }
        Date date = new Date(System.currentTimeMillis());
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Date result = null;
        try {
            result = dateFormat.parse(dateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 以字符串形式返回pattern格式的时间，若source为null，返回当前时间；若pattern为null，返回格式为yyyy-MM-dd hh:mm:ss
     *
     * @param pattern
     * @return
     */
    public static String getFormatDateStrDefault(Date source,String pattern) {
        if (source==null){
            source = new Date(System.currentTimeMillis());
        }
        if (pattern == null) {
            pattern = "yyyy-MM-dd HH:mm:ss";
        }
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(source);
    }

    /**
     * 返回汉字格式化的时间字符串
     * @param date
     * @return
     */
    public static String getReadableDateStr(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        return dateFormat.format(date);
    }

    /**
     *  将时间字符串解释为时间对象
     * @param pattern 若pattern为null，解释格式为yyyy-MM-dd hh:mm:ss
     * @param dateString 时间字符串
     * @return
     * @throws ParseException
     */
    public static Date parseDate(String pattern,String dateString) throws ParseException {
        if (pattern==null){
            pattern = "yyyy-MM-dd HH:mm:ss";
        }
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.parse(dateString);
    }
}

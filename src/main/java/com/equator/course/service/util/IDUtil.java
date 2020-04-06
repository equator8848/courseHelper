package com.equator.course.service.util;



import java.util.UUID;

/**
 * Created by LiBinKai on 2019/2/5
 **/
public class IDUtil {
    /**
     *  使用UUID生成绝对唯一的32位字符串随机序列
     * @return String
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    /**
     * 获取指定位数的验证码
     * @param bit
     * @return
     */
    public static String getAuthCode(Integer bit){
        String authCode = "";
        for (int i=0;i<bit;i++){
            authCode+=((int)(Math.random()*10));
        }
        return authCode;
    }
}

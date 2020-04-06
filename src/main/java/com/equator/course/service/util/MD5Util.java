package com.equator.course.service.util;

import org.springframework.util.DigestUtils;

import java.util.Random;

public class MD5Util {

    /**
     *  MD5加密
     * @param source
     * @return
     */
    public static String encry(String source){
        String encodeStr = DigestUtils.md5DigestAsHex(source.getBytes()).toLowerCase();
        return encodeStr;
    }

    /**
     *
     * @param source 数据库里保存的密码
     * @param key 密码加盐后的组合字符串
     * @return
     */
    public static boolean vertify(String source,String key){
        if ((MD5Util.encry(key).toLowerCase()).equals(source)){
            return true;
        }else {
            return false;
        }
    }

    /**
     *  获取盐值
     * @return
     */
    public static String getSalt(){
        String salts[] = {"@","#","$","%","&","*","!","^","-","+"};
        Random random = new Random();
        return salts[random.nextInt(10)]+salts[random.nextInt(10)]+salts[random.nextInt(10)]+salts[random.nextInt(10)];
    }
}

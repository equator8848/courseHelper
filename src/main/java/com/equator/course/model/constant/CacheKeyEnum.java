package com.equator.course.model.constant;

/**
 * @Author: Equator
 * @Date: 2019/9/12 20:51
 **/

public enum CacheKeyEnum {
    //redis缓存 key
    ATTOP_ANWSER_CACHE_NEVER("AttopAnwserCache", -1),
    REQUEST_TIMES_NEVER("RequestTimesCache", -1);

    private String value;
    private long expire;

    CacheKeyEnum(String value, long expire) {
        this.value = value;
        this.expire = expire;
    }

    public String getValue() {
        return value;
    }

    public long getExpire() {
        return expire;
    }
}

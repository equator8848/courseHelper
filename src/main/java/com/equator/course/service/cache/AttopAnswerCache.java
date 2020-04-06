package com.equator.course.service.cache;

import com.equator.course.model.constant.CacheKeyEnum;
import com.equator.course.service.util.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 至善网
 *
 * @Author: Equator
 * @Date: 2020/4/6 14:20
 **/

@Component
public class AttopAnswerCache {
    @Autowired
    private RedisTemplate redisTemplate;

    public void setCache(String questionTitle, String answerList) {
        redisTemplate.opsForHash().put(CacheKeyEnum.ATTOP_ANWSER_CACHE_NEVER.getValue(), questionTitle, answerList);
    }

    public String getCache(String questionTitle) {
        return (String) redisTemplate.opsForHash().get(CacheKeyEnum.ATTOP_ANWSER_CACHE_NEVER.getValue(), questionTitle);
    }
}

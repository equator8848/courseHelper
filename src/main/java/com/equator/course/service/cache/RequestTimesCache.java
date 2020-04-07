package com.equator.course.service.cache;

import com.equator.course.model.constant.CacheKeyEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @Author: Equator
 * @Date: 2020/4/7 15:51
 **/

@Component
public class RequestTimesCache {
    @Autowired
    private RedisTemplate redisTemplate;

    public void add() {
        redisTemplate.opsForValue().increment(CacheKeyEnum.REQUEST_TIMES_NEVER.getValue());
    }

    public Integer get() {
        return (Integer) redisTemplate.opsForValue().get(CacheKeyEnum.REQUEST_TIMES_NEVER.getValue());
    }
}

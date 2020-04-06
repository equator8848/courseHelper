package com.equator.course.service.impl;

import com.equator.course.service.TestService;
import com.equator.course.service.util.IDUtil;
import com.equator.course.service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Equator
 * @Date: 2020/4/6 14:22
 **/

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Response ping(String key) {
        String val = IDUtil.getUUID();
        redisTemplate.opsForValue().set(key, val, 1, TimeUnit.HOURS);
        return Response.success("pong", redisTemplate.opsForValue().get(key));
    }
}

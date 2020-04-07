package com.equator.course.controller;

import com.equator.course.service.TestService;
import com.equator.course.service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Equator
 * @Date: 2020/4/6 14:13
 **/

@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/ping")
    public Response ping(String key) {
        return testService.ping(key);
    }


    @GetMapping("/getRequestTimes")
    public Response getRequestTimes() {
        return testService.getRequestTimes();
    }
}

package com.equator.course.controller;

import com.equator.course.model.dto.AttopAnswer;
import com.equator.course.model.req.AttopAnswerReq;
import com.equator.course.service.AttopService;
import com.equator.course.service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * @Author: Equator
 * @Date: 2020/4/6 14:59
 **/

@Validated
@RestController
@RequestMapping("/api/attop")
public class AttopController {
    @Autowired
    private AttopService attopService;

    @PostMapping("/uploadAnswer")
    public Response up(@RequestBody AttopAnswerReq attopAnswerReq) {
        return attopService.uploadAnswer(attopAnswerReq);
    }

    @PostMapping("/getAnswer")
    public Response up(@NotNull String questionTitle) {
        return attopService.getAnswer(questionTitle);
    }
}

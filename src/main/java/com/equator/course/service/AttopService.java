package com.equator.course.service;

import com.equator.course.model.dto.AttopAnswer;
import com.equator.course.model.req.AttopAnswerReq;
import com.equator.course.service.util.Response;

/**
 * 至善网
 *
 * @Author: Equator
 * @Date: 2020/4/6 14:35
 **/

public interface AttopService {
    Response uploadAnswer(AttopAnswerReq attopAnswerReq);

    Response getAnswer(String questionTitle);
}

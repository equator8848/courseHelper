package com.equator.course.service.impl;

import com.equator.course.model.dto.AttopAnswer;
import com.equator.course.model.req.AttopAnswerReq;
import com.equator.course.service.AttopService;
import com.equator.course.service.cache.AttopAnswerCache;
import com.equator.course.service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Equator
 * @Date: 2020/4/6 14:39
 **/

@Service
public class AttopServiceImpl implements AttopService {
    @Autowired
    private AttopAnswerCache attopAnswerCache;

    @Override
    public Response uploadAnswer(AttopAnswerReq attopAnswerReq) {
        attopAnswerReq.getAttopAnswers().forEach((answer) -> {
            if (!"".equals(answer.getQuestionTitle())) {
                attopAnswerCache.setCache(answer.getQuestionTitle(), answer.getAnswerList());
            }
        });
        return Response.success("答案上传成功！", null);
    }

    @Override
    public Response getAnswer(String questionTitle) {
        return Response.success("答案获取成功", attopAnswerCache.getCache(questionTitle));
    }
}

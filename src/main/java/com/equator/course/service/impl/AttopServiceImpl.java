package com.equator.course.service.impl;

import com.equator.course.model.constant.SecurityConfiguration;
import com.equator.course.model.dto.AttopAnswer;
import com.equator.course.model.req.AttopAnswerReq;
import com.equator.course.service.AttopService;
import com.equator.course.service.cache.AttopAnswerCache;
import com.equator.course.service.cache.RequestTimesCache;
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
    @Autowired
    private RequestTimesCache requestTimesCache;

    @Override
    public Response uploadAnswer(AttopAnswerReq attopAnswerReq) {
        if (attopAnswerReq.getKey() == null || "".equals(attopAnswerReq.getKey()) || !SecurityConfiguration.UPLOAD_ANSWER_KEY.getVal().equals(attopAnswerReq.getKey())) {
            return Response.forbidden("为了防止答案被污染，请在github上联系管理员获取正确的密钥", null);
        }
        attopAnswerReq.getAttopAnswers().forEach((answer) -> {
            if (!"".equals(answer.getQuestionTitle())) {
                attopAnswerCache.setCache(answer.getQuestionTitle(), answer.getAnswerList());
            }
        });
        return Response.success("答案上传成功！", null);
    }

    @Override
    public Response getAnswer(String questionTitle) {
        requestTimesCache.add();
        return Response.success("答案获取成功", attopAnswerCache.getCache(questionTitle));
    }
}

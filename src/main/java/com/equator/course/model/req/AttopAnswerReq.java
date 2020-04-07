package com.equator.course.model.req;

import com.equator.course.model.dto.AttopAnswer;
import lombok.Data;

import java.util.List;

/**
 * @Author: Equator
 * @Date: 2020/4/6 14:37
 **/

@Data
public class AttopAnswerReq {
    String key;
    List<AttopAnswer> attopAnswers;
}

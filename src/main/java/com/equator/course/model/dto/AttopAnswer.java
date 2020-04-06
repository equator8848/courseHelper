package com.equator.course.model.dto;

import lombok.Data;

/**
 * @Author: Equator
 * @Date: 2020/4/6 14:37
 **/

@Data
public class AttopAnswer {
    // 转码至MD5
    private String questionTitle;
    // 1,3,5 以逗号分隔
    private String answerList;
}

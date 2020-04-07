package com.equator.course.model.constant;

/**
 * @Author: Equator
 * @Date: 2020/4/7 15:54
 **/

public enum SecurityConfigurationSample {
    // 密钥
    UPLOAD_ANSWER_KEY("123456");
    private String val;

    SecurityConfigurationSample(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}

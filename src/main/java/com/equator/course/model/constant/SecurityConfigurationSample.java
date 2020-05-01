package com.equator.course.model.constant;

/**
 * 实际上有一个SecurityConfiguration类保存了敏感信息，但是被gitignore了
 * 此SecurityConfigurationSample为样本
 *
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

package com.equator.course.model;

/**
 * Created by Equator on 2019/8/20
 **/
public enum ResponseCode {
    //处理未完成，或者操作失败
    FAIL(-1),
    //成功
    SUCCESS(200),
    //权限不足
    FORBIDDEN(403),
    //请求无效，客户端错误
    BAD_REQUEST(400),
    //服务器错误
    SERVER_ERROR(500);

    private int status;

    ResponseCode(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

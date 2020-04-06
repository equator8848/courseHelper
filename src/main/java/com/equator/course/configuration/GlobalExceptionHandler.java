package com.equator.course.configuration;

import com.equator.course.service.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolationException;

/**
 * @Author: Equator
 * @Date: 2019/8/26 9:15
 **/

/**
 * 统一异常管理
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public Response<String> ConstraintViolationExceptionExceptionHandler(Exception e){
        log.error("参数错误：{}",e.getMessage());
        return Response.badRequest("参数错误",e.getMessage());
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseBody
    public Response<String> MissingServletRequestParameterExceptionHandler(Exception e){
        log.error("参数错误：{}",e.getMessage());
        return Response.badRequest("参数错误",e.getMessage());
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseBody
    public Response<String> HttpRequestMethodNotSupportedExceptionHandler(Exception e){
        log.error("请求方法错误：{}",e.getMessage());
        return Response.badRequest("请求方法错误",e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Response<String> MethodArgumentNotValidExceptionExceptionHandler(MethodArgumentNotValidException e){
        log.error("参数错误 {}",e.getMessage());
        FieldError fieldError = e.getBindingResult().getFieldError();
        return Response.badRequest("参数错误",fieldError==null?"":fieldError.getField()+fieldError.getDefaultMessage());
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public Response<String> BindExceptionExceptionHandler(BindException e){
        log.error("参数错误 {}",e.getMessage());
        FieldError fieldError = e.getBindingResult().getFieldError();
        return Response.badRequest("参数错误",fieldError==null?"":fieldError.getField()+fieldError.getDefaultMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response<String> exceptionHandler(Exception e){
        e.printStackTrace();
        log.error("服务器错误：{}",e.getMessage());
        return Response.serverError("服务器异常",e.getMessage());
    }
}

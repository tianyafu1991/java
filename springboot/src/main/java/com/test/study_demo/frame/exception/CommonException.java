package com.test.study_demo.frame.exception;

import com.test.study_demo.frame.enums.StatusCodeEnum;

/**
 * @description: 鉴权异常
 * @author: Zeng
 * @date: 2018/05/29.
 */
public class CommonException extends RuntimeException {
    private Integer code;

    public CommonException(String message) {
        super(message);
        this.code = StatusCodeEnum.INVALID_REQUEST.getKey();
    }

    public CommonException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public CommonException(StatusCodeEnum statusCode) {
        super(statusCode.getValue());
        this.code = statusCode.getKey();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

package com.test.study_demo.frame.response;

import com.test.study_demo.frame.enums.StatusCodeEnum;

public class CommonResponse {

    /**
     * 返回状态
     *
     * @see StatusCodeEnum
     */
    private Integer statusCode;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 错误返回结果msg
     */
    public static final String RESULT_MSG_FAILURE = "操作失败！";

    /**
     * 正确返回结果msg
     */
    public static final String RESULT_MSG_SUCCESS = "操作成功！";

    /**
     * 总大小
     */
    private Long total;

    private Object object;



    public CommonResponse() {
        this.statusCode = StatusCodeEnum.OK.getKey();
    }

    public CommonResponse(Object object) {
        this.statusCode = StatusCodeEnum.OK.getKey();
        this.object = object;
    }

    public CommonResponse(Object object,Long total) {
        this.statusCode = StatusCodeEnum.OK.getKey();
        this.object = object;
        this.total = total;
    }

    public CommonResponse(StatusCodeEnum statusCode) {
        this.statusCode = statusCode.getKey();
        this.message = statusCode.getValue();
    }

    public CommonResponse(Long total ,Object object, StatusCodeEnum statusCode) {
        this.total = total;
        this.object = object;
        this.statusCode = statusCode.getKey();
        this.message = statusCode.getValue();
    }

    public CommonResponse(StatusCodeEnum statusCode, String message) {
        if (statusCode != null) {
            this.statusCode = statusCode.getKey();
        }
        this.message = message;
    }

    public CommonResponse(Long total ,Object object, StatusCodeEnum statusCode, String message) {
        this.total = total;
        this.object = object;
        if (statusCode != null) {
            this.statusCode = statusCode.getKey();
        }
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    /**
     * 功能说明：返回一个请求成功的响应模板
     *
     * @param
     * @return CommonResponse
     */
    public static CommonResponse success() {
        CommonResponse response = new CommonResponse();
        response.setStatusCode(StatusCodeEnum.OK.getKey());
        response.setMessage(RESULT_MSG_SUCCESS);
        return response;
    }

    /**
     * 功能说明：返回一个请求成功的响应模板
     *
     * @return CommonResponse
     */
    public static CommonResponse success(Object object) {
        CommonResponse response = new CommonResponse(object);
        response.setStatusCode(StatusCodeEnum.OK.getKey());
        response.setMessage(RESULT_MSG_SUCCESS);
        return response;
    }

    /**
     * 功能说明：返回一个请求成功的响应模板
     *
     * @return CommonResponse
     */
    public static CommonResponse success(Object object ,Long total) {
        CommonResponse response = new CommonResponse(object,total);
        response.setStatusCode(StatusCodeEnum.OK.getKey());
        response.setMessage(RESULT_MSG_SUCCESS);
        return response;
    }

    /**
     * 功能说明：返回一个请求失败的响应模板
     *
     * @return CommonResponse 错误类别为默认的INVALID_REQUEST（请求错误）
     */
    public static CommonResponse failure() {
        CommonResponse response = new CommonResponse();
        response.setStatusCode(StatusCodeEnum.INVALID_REQUEST.getKey());
        response.setMessage(RESULT_MSG_FAILURE);
        return response;
    }

    /**
     * 功能说明：返回一个请求失败的响应模板
     *
     * @param message
     * @return CommonResponse 错误类别为默认的INVALID_REQUEST（请求错误）
     */
    public static CommonResponse failure(String message) {
        CommonResponse response = new CommonResponse();
        response.setMessage(message);
        response.setStatusCode(StatusCodeEnum.INVALID_REQUEST.getKey());
        return response;
    }

    /**
     * 功能说明：返回一个请求失败的响应模板
     *
     * @param code    错误编码
     * @param message 错误信息
     * @return CommonResponse 错误类别为默认的INVALID_REQUEST（请求错误）
     */
    public static CommonResponse failure(int code, String message) {
        CommonResponse response = new CommonResponse();
        response.setStatusCode(code);
        response.setMessage(message);
        return response;
    }

    /**
     * 功能说明：返回一个请求失败的响应模板，具体错误类型根据参数决定
     *
     * @param statusCode 错误类型
     * @return CommonResponse
     */
    public static CommonResponse failure(StatusCodeEnum statusCode) {
        CommonResponse response = new CommonResponse();
        response.setStatusCode(statusCode.getKey());
        response.setMessage(statusCode.getValue());
        return response;
    }

    /**
     * 功能说明：返回一个请求失败的响应模板，具体错误类型根据参数决定
     *
     * @param statusCode
     * @return CommonResponse 错误类别为默认的INVALID_REQUEST（请求错误）
     */
    public static CommonResponse failure(StatusCodeEnum statusCode, String message) {
        CommonResponse response = new CommonResponse();
        response.setStatusCode(statusCode.getKey());
        response.setMessage(message);
        return response;
    }


    /**
     * 功能说明：返回一个请求失败的响应模板
     *
     * @param e 异常参数不能为空
     * @return CommonResponse
     */
    public static CommonResponse failure(Exception e) {
        CommonResponse response = new CommonResponse();
        response.setMessage(RESULT_MSG_FAILURE);
        response.setStatusCode(StatusCodeEnum.INTERNAL_SERVER_ERROR.getKey());
        return response;
    }

    /**
     * 功能说明：返回一个请求失败的响应模板
     *
     * @param e 异常参数不能为空
     * @return CommonResponse
     */
    public static CommonResponse failure(CommonResponse e) {
        CommonResponse response = new CommonResponse();
        if (e != null) {
            response.setStatusCode(getStatusCode(e));
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * 功能说明：返回一个请求失败未经授权的响应模板
     *
     * @return CommonResponse 错误类别为默认的UNAUTHORIZED（未经授权）
     */
    public static CommonResponse unauthorized() {
        CommonResponse response = new CommonResponse();
        response.setStatusCode(StatusCodeEnum.UNAUTHORIZED.getKey());
        response.setMessage(StatusCodeEnum.UNAUTHORIZED.getValue());
        return response;
    }

    /**
     * 功能说明：返回一个请求失败未经授权的响应模板
     *
     * @param message
     * @return CommonResponse 错误类别为默认的UNAUTHORIZED（未经授权）
     */
    public static CommonResponse unauthorized(String message) {
        CommonResponse response = new CommonResponse();
        response.setStatusCode(StatusCodeEnum.UNAUTHORIZED.getKey());
        response.setMessage(message);
        return response;
    }




    /**
     * 功能说明：根据错误类别返回错误码
     *
     * @param e
     * @return Integer
     */
    public static Integer getStatusCode(CommonResponse e) {
        return StatusCodeEnum.INTERNAL_SERVER_ERROR.getKey();
    }

    @Override
    public String toString() {
        return "CommonResponse{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", total=" + total +
                ", object=" + object +
                '}';
    }


}

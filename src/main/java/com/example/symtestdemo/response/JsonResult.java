/*
 * Copyright (c) 2019, New Orange Group and/or its affiliates. All rights reserved.
 */

package com.example.symtestdemo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: winter
 * @Description:
 * @Date Created in 2021-03-19-19:26
 * @Modified By:
 */
@ApiModel(value = "基础返回类", description = "基础返回类")
public class JsonResult<T> {
    @ApiModelProperty(name = "状态码:", value = "0:成功1:失败")
    private int status;
    @ApiModelProperty(name = "错误码:", value = "0:成功1:失败")
    private String code;
    @ApiModelProperty(name = "总数:", value = "总数")
    private Integer size;
    @ApiModelProperty(name = "错误信息:", value = "系统异常")
    private String msg;
    @ApiModelProperty(name = "返回数据:", value = "返回数据{}")
    private T data;

    public JsonResult() {
    }

    public JsonResult(int status, String code, Integer size, String msg, T data) {
        this.status = status;
        this.code = code;
        this.size = size;
        this.data = data;
        this.msg = msg;
    }

    public static <U> JsonResult<U> buildSuccessResult() {
        JsonResult result = new JsonResult(0, "0", 0, "成功", null);
        return result;
    }
    public static <U> JsonResult<U> buildSuccessResult(U data) {
        JsonResult result = new JsonResult(0, "0", 0, "成功", data);
        return result;
    }


    public static <U> JsonResult<U> buildSuccessResult(U data, int size) {
        JsonResult result = new JsonResult(0, "0", size, "成功", data);
        return result;
    }



    public static <U> JsonResult<U> buildFaliureResult(U data) {
        JsonResult result = new JsonResult(1, "1", 0, "失败", data);
        return result;
    }
    public static <U> JsonResult<U> buildFaliureResult() {
        JsonResult result = new JsonResult(1, "1", 0, "失败", null);
        return result;
    }

    /**
     * 失败
     */
    public static <U> JsonResult<U> error(BusinessException errorInfo) {
        JsonResult rb = new JsonResult();
        rb.setSize(1);
        rb.setCode(errorInfo.getErrorCode() + "");
        rb.setMsg(errorInfo.getErrorMessage());
        rb.setData(null);
        return rb;
    }


    public static <U> JsonResult<U> of(ResultCode code) {
        if (ResultCode.OK == code || ResultCode.OK_PASSWORD == code || ResultCode.AI_ANALYSIS_RESULT_CODE ==code) {
            return new JsonResult(0, code.getStatus(), 0, code.getMessage(), null);
        }
        JsonResult result = new JsonResult(1, code.getStatus(), null, code.getMessage(), null);
        return result;
    }

    public static <U> JsonResult<U> of(ResultCode code,String msg) {
        return new JsonResult(1, code.getStatus(), 0, msg, null);
    }

    public static <U> JsonResult<U> of() {
        JsonResult result = new JsonResult(0, "0", null, "成功", null);
        return result;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

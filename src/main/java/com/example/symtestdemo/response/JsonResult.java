/*
 * Copyright (c) 2019, Jugong Technologies and/or its affiliates. All rights reserved.
 */

package com.example.symtestdemo.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * The JSON utility for controller response.
 *
 * @param <T> The data type.
 * @author zhangwenfei@jugongtech.com
 * @date 2019-12-10
 */

@ApiModel(description = "通用响应返回对象")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class JsonResult<T>{

    private static final long serialVersionUID = -6268217109787098958L;

    private int status;

    @ApiModelProperty(value = "结果代码", position = 0)
    private int code;

    private Integer size;

    @ApiModelProperty(value = "结果数据", position = 2)
    private T data;

    @ApiModelProperty(value = "错误信息", position = 1)
    private String errMsg;
    
    public JsonResult() {}

    public JsonResult(int status, int code, Integer size, String errMsg, T data) {
        this.status = status;
        this.code = code;
        this.size = size;
        this.data = data;
        this.errMsg = errMsg;
    }

    public static <U> JsonResult<U> buildSuccessResult(U data) {
        JsonResult result = new JsonResult(0, 0, null, null, data);
        return result;
    }

    public static <U> JsonResult<U> buildSuccessResult(U data, int size) {
        JsonResult result = new JsonResult(0, 0, size, null, data);
        return result;
    }

    public static <U> JsonResult<U> buildFailResult(int status, int busiCode, String errMsg, U data) {
        JsonResult<U> result = new JsonResult(status, busiCode, null, errMsg, data);
        return result;
    }

    public static <U> JsonResult<U> of(ApiError error) {
        if (ApiError.SUCCESS == error) {
            return new JsonResult(0, error.value(), null, error.getMessage(), null);
        }
        JsonResult result = new JsonResult(1, error.value(), null, error.getMessage(), null);
        return result;
    }

    public static <U> JsonResult<U> of() {
        JsonResult result = new JsonResult(0, 200, null, null, null);
        return result;
    }
}

/*
 * Copyright (c) 2019, New Orange Group and/or its affiliates. All rights reserved.
 */

package com.example.symtestdemo.response;

/**
 * @Author: winter
 * @Description:
 * @Date Created in 2021-04-02-11:09
 * @Modified By:
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = -4879677283847539655L;

    private String errorCode;

    private String errorMessage;

    private String exceptionMessage;

    private Exception exception;

    public BusinessException(String errorMessage) {
        super();
        this.errorMessage = errorMessage;
    }

    public BusinessException(String errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BusinessException(String errorCode, String errorMessage, Exception exception) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.exception = exception;
    }



    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public BusinessException(String errorCode, String errorMessage, String exceptionMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.exceptionMessage = exceptionMessage;
    }


}

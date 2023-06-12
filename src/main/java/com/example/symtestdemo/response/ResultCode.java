/*
 * Copyright (c) 2019, New Orange Group and/or its affiliates. All rights reserved.
 */

package com.example.symtestdemo.response;

/**
 * @Author: winter
 * @Description:
 * @Date Created in 2021-03-19-19:15
 * @Modified By:
 */
public enum ResultCode {
    OK("0", "成功"),
    OK_PASSWORD("0", "密码修改成功"),

    /**
     * 一级宏观错误码
     */
    USER_NOT_LOGIN("A0000", "用户没有登录"),
    CLIENT_ERROR("A0001", "用户端错误 "),
    REG_ERROR("A0100", "用户注册错误"),
    USER_NAME_CHECK_ERROR("A0110", "用户名校验失败"),
    USER_ALREADY_EXIST_ERROR("A0111", "用户名已存在"),
    USER_LOGIN_EXIST_ERROR("A0114", "用户已登录"),
    USER_SENSITIVE_ERROR("A0112", "用户名包含敏感词"),
    USER_SPECIAL_ERROR("A0113", "用户名包含特殊字符"),
    USER_ADMIN_ERROR("A1111", "本单位已存在管理人员"),
    USER_LOGIN_TIMEOUT("A0115", "用户登录超时"),
    FAILED_PASSWORD_ERROR("A0120", "密码校验失败"),
    FAILED_CARD_CHOOSE_ERROR("A0141", "用户证件类型未选择"),
    FAILED_CARD_CHECK_ILLEGAL("A0142", "大陆身份证编号校验非法"),
    USER_CHECK_ILLEGAL("A0150", "用户基本信息校验失败"),
    MOBILE_PHONE_CHECK_ILLEGAL("A0151", "用户基本信息校验失败"),
    ADDRESS_CHECK_ILLEGAL("A0152", "地址格式校验失败"),
    EMAIL_CHECK_ILLEGAL("A0153", "邮箱格式校验失败"),
    USER_LOGIN_ERROR("A0200", "用户登录异常"),
    USER_NOT_ERROR("A0201", "用户账户不存在"),

    NOT_CURR_USER("A029", "不是当前用户"),


    USER_PHONE_ERROR("A0301", "手机号不存在，请使用身份证号登录"),
    USER_PHONE("A0302", "该手机号已出现在账号中"),

    USER_FROZEN_ERROR("A0202", "用户账户被冻结或删除或未启用"),
    USER_CANCELLATION_ERROR("A0203", "用户账户已作废"),
    USER_PASSWORD_ERROR("A0210", "用户密码错误"),
    USER_PASSWORD_LIMIT_ERROR("A0211", "用户输入密码错误次数超限"),
    USER_OLD_PASSWORD_ERROR("A0212", "输入旧密码错误"),
    USER_NEW_PASSWORD_ERROR("A0213", "请输入新密码"),
    USER_CHECK_ERROR("A0220", "用户身份校验失败"),
    USER_THIED_LOGIN_ERROR("A0223", "用户未获得第三方登录授权"),
    USER_TIMEOUT_LOGIN_ERROR("A0230", "用户登录已过期"),
    USER_ACCESS_PERMISSION("A0300", "无权限访问操作"),
    USER_ACCESS_UNAUTHORIZED("A0301", "访问未授权"),
    USER_ACCESS_AUTHORIZATION("A0302", "正在授权中"),
    USER_REQUEST_AUTHORIZATION_DENIED("A0303", "用户授权申请被拒绝"),
    UNAUTHORIZED_USE("A0312", "无权限操作"),
    UNAUTHORIZED_USE_TYPE("A0313", "使用次数不足或授权已过期"),
    USE_ACCESS_BLOCKED("A0320", "用户访问被拦截"),
    USE_BLACKLIST("A0321", "黑名单用户"),
    USE_UNIT_UNAUTHORIZED("A0322", "单位未授权"),
    FACE_AUTH_FAILED("A0323", "人脸认证失败!"),
    USE_REQUSET_PARAMETER_ERROR("A0400", "用户请求参数错误"),
    INVAILD_USER_INPUT("A0402", "无效的用户输入"),
    REQUSET_PARAMETER_BLANK("A0410", "请求必填参数为空"),
    MISSING_TIMESTAMP_PARAMETER("A0413", "缺少时间戳参数"),
    ILLEGAL_TIMESTAMP_PARAMETER("A0414", "非法的时间戳参数"),
    PARAMETER_NOT_MATCH("A0421", "参数格式不匹配"),
    USER_OPERATION_EXCEPTION("A0421", "用户操作异常"),
    WEBSOCKET_CONN_EXCEPTION("A0504", "WebSocket 连接异常"),
    WEBSOCKET_CONN_BROKEN("A0505", "WebSocket 连接异常"),
    USER_UPLOAD_FILE_ERROR("A0700", "用户上传文件异常"),
    SYSTEM_EXECUTION_ERROR("B0001", "系统执行出错"),
    THIRD_SERVICE_ERROR("C0001", "调用第三方服务出错"),
    MIDDLEWARE_SERVICE_ERROR("C0100", "中间件服务出错"),
    INTERFACE_DOES_NOT_EXIST("C0113", "接口不存在"),
    MESSAHE_SERVICE_ERROR("C0120", "消息服务出错"),
    MESSAHE_SEND_ERROR("C0121", "消息投递出错"),
    MESSAHE_CONSUMPTION_ERROR("C0122", "消息消费出错"),
    CACHING_SERVICE_ERROR("C0130", "缓存服务出错"),
    UNSUPPORTED_DATA_FORMAT("C0134", "不支持的数据格式"),
    THIRDPARTY_SERVICE_TIMEOUT_ERROR("C0200", "第三方系统执行超时"),
    DATABASE_SERVICE_ERROR("C0300", "数据库服务出错"),
    NOT_UPDATE_ERROR("D0001", "本数据不支持修改"),
    DW_ALREADY_EXIST_ERROR("D0002", "单位已经存在"),
    USER_CARD_NOT_ERROR("D0003", "警号不能为空"),
    USER_PHONE_NOT_ERROR("D0004", "手机号不存在"),
    USER_DW_NOT_ERROR("D0003", "请填写部门"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误!"),

    PASSWORD_NOT_EXIST("D0004", "请填写密码"),
    /***Fugitive information error***/
    DATA_TOO_MUCH_ERROR("100000", "数据过多,请输入查询条件进行搜索"),
    SEARCH_ERROR("100001", "查询异常"),
    CLUE_FLOW_ES_SELECT_ERROR("100002", "服务异常，查询失败，请重试"),
    FUGITIVE_NOT_SEARCH_ERROR("100003", "该在逃人员无身份证号，可能为无效数据"),
    FUGITIVE_LABEL_IS_NULL("100004", "在逃人员标签为空"),
    ONLINE_CODE_IS_NULL("100005", "上网单位onlineCode为空"),
    ADD_ERROR("100006", "增加失败"),
    ADD_LABEL_ALREADY_EXISTS("100007", "标签已被增加"),
    ADD_EXCEPTION("100008", "增加异常"),
    ID__NOT_EXIST("100007", "id不存在"),
    NON_ONLINE_CANNOT_OPERATE("100008", "非上网单位不能操作"),
    DELETE_EXCEPTION("100009", "删除标签异常"),
    FUGITIVE_NOT_CARD("100010", "该在逃人员无身份证号，可能为无效数据"),
    FUGITIVE_HEAD_PORTRAIT_ISNULL("100011", "在逃人员头像为空"),
    FUGITIVE_ADD_HEAD_ERROR("100012", "增加在逃人员头像失败"),
    FUGITIVE_ADD_HEAD_EXCEPTION("100013", "增加在逃人员头像异常"),
    FUGITIVE_NOT_ONLINE_CODE("100014", "非上网单位不能操作"),
    ID_NOT_EXIST("100015", "id不存在"),
    ONLINE_CODE_ISNULL("100016", "上网单位onlineCode为空"),
    DELETE_HEAD_EXCEPTION("100017","删除头像异常"),
    MINIO_UPLOAD_ERROR("100018","minio上传失败"),
    ATTENTION_ALREADY_EXISTS("100019","该逃犯您已关注"),

    /***data sync error***/
    SYNC_LOCAL_PERSON_ERROR("SYNC00001","本地上网ZTRY手工同步失败"),
    SYNC_OUT_PERSON_ERROR("SYNC00002","外地关联ZTRY手工同步失败"),
    SYNC_PERSON_REVOKED_STATE_ERROR("SYNC00003","ZTRY撤销状态信息手工同步失败"),
    SYNC_ALARM_BASIC_ERROR("SYNC00004","预警指令信息手工同步失败"),
    SYNC_ALARM_STATE_ERROR("SYNC00005","预警指令状态手工同步失败"),
    SYNC_ALARM_OPERATION_ERROR("SYNC00006","预警指令操作信息手工同步失败"),
    SYNC_ALARM_PHONE_REJECTION_ERROR("SYNC00007","预警指令手机号码黑名单手工同步失败"),

    CLUE_JUDGEMENT_REPORT_GET_FAILURE("BG0000001", "获取研判分析报告失败"),

    /**message reminder error*/
    REMINDER_MESSAGE_GET_TAB_COUNT_FAILURE("MSG00001", "获取消息提醒tab名称及各条目总数列表失败"),
    REMINDER_MESSAGE_GET_LATEST_LIST_FAILURE("MSG00002", "获取最新消息列表失败"),
    REMINDER_MESSAGE_GET_LIST_FAILURE("MSG00003", "获取消息列表失败"),
    REMINDER_MESSAGE_SET_READ_STATE_FAILURE("MSG00004", "设置消息读取状态失败"),
    REMINDER_MESSAGE_SET_ALL_READ_STATE_FAILURE("MSG00005", "一键设置消息读取状态失败"),
    REMINDER_MESSAGE_SET_PUSH_STATE_FAILURE("MSG00006", "设置消息推送状态失败"),
    REMINDER_MESSAGE_GET_READ_STATE_FAILURE("MSG00007", "获取消息读取状态失败"),
    REMINDER_MESSAGE_SET_DELETE_STATE_FAILURE("MSG00008", "设置消息软删除状态失败"),
    IMAGE_OPERATE_FATAL_FACE("5021", "图片过大或GPU资源不足"),
    RESULT_NONE("5022", "比对不到结果"),

    LOCK_IP("6000","恶意刷新和暴力请求"),
    DOWNLOAD_ERR("5023", "下载失败"),
    AI_ANALYSIS_RESULT_CODE("AI_RESULT_001","数据处理中,请稍后再试"),

    /**file relate**/
    FILE_NOT_EXIST("7000","文件不存在"),
    ;
    private String status;

    private String message;

    ResultCode(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResultCode{status=" + status + ",message=" + message + "}";
    }

}

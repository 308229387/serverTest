package com.example.symtestdemo.response;

/**
 * 接口错误码定义
 *
 * @author zhangwenfei@jugongtech.com
 * @date 2019-12-10
 * 1XXXX: 通用错误码
 * 2XXXX: 档案
 * 3XXXX: 研判报告
 * 4XXXX: 审批流程
 */

public enum ApiError {
    // ---------------------------------------------
    // 成功
    // ---------------------------------------------
    SUCCESS(0, "成功！"),

    // ---------------------------------------------
    // 通用错误码
    // ---------------------------------------------
    SERVER_ERROR(10001, "服务器出现未知错误，请联系管理人员！"),
    PARAMS_ERROR(10002, "参数非法，请检查"),
    TIME_FORMAT_ERROR(10003, "时间格式错误,请用yyyy-MM-dd HH:mm:ss格式"),
    USER_NOT_EXIST(10004, "帐户不存在"),
    USER_NOT_LOGIN(10004, "请登录登录"),
    USER_PASSWORD_ILLEGAL(10004, "帐户或密码错误"),
    DICT_FAILURE(1000, "获取字典失败"),
    USER_OFFLINE(10006,"接收方已离线"),
    MESSAGE_SEND_FAILURE(10007,"信息发送失败"),
    REMOTE_CALL_FAILURE(10008,"远程调用错误"),

    // ---------------------------------------------
    // 个人档案相关
    // ---------------------------------------------
    FILE_REGISTRY_CREATE_FAILURE(20001, "增加注册信息失败"),
    FILE_REGISTRY_NOT_EXIST(20002, "指定的个人没有注册信息"),
    FILE_REGISTRY_QUERY_FAILURE(20003, "查询注册信息失败"),
    FILE_REGISTRY_LIST_FAILURE(20004, "查询注册信息列表失败"),
    FILE_REGISTRY_UPDATE_FAILURE(20005, "更新注册信息失败"),
    FILE_REGISTRY_DELETE_FAILURE(20006, "删除注册信息失败"),

    FILE_TRACE_CREATE_FAILURE(20007, "增加轨迹信息失败"),
    FILE_TRACE_NOT_EXIST(20008, "指定的个人没有轨迹信息"),
    FILE_TRACE_QUERY_FAILURE(20009, "查询轨迹信息失败"),
    FILE_TRACE_LIST_FAILURE(20010, "查询轨迹信息列表失败"),
    FILE_TRACE_UPDATE_FAILURE(20011, "更新轨迹信息失败"),
    FILE_TRACE_DELETE_FAILURE(20012, "删除轨迹信息失败"),

    FILE_ADDRESS_CREATE_FAILURE(20007, "增加地址信息失败"),
    FILE_ADDRESS_NOT_EXIST(20008, "指定的个人没有轨迹信息"),
    FILE_ADDRESS_QUERY_FAILURE(20009, "查询地址信息失败"),
    FILE_ADDRESS_LIST_FAILURE(20010, "查询地址信息列表失败"),
    FILE_ADDRESS_UPDATE_FAILURE(20011, "更新地址信息失败"),
    FILE_ADDRESS_DELETE_FAILURE(20012, "删除地址信息失败"),

    FILE_RELATION_CREATE_FAILURE(20007, "增加关系人信息失败"),
    FILE_RELATION_NOT_EXIST(20008, "指定的个人没有关系人信息"),
    FILE_RELATION_QUERY_FAILURE(20009, "查询关系人信息失败"),
    FILE_RELATION_LIST_FAILURE(20010, "查询关系人信息列表失败"),
    FILE_RELATION_UPDATE_FAILURE(20011, "更新关系人信息失败"),
    FILE_RELATION_DELETE_FAILURE(20012, "删除关系人信息失败"),

    CLUE_JUDGEMENT_CREATE_MANUAL_INFO_FAILURE(20013, "添加手动信息失败"),
    CLUE_JUDGEMENT_UPDATE_MANUAL_INFO_FAILURE(20014, "更新手动信息失败"),
    CLUE_JUDGEMENT_DELETE_MANUAL_INFO_FAILURE(20015, "删除手动信息失败"),
    CLUE_JUDGEMENT_ADD_INFO_FAILURE(20016, "增加线索信息失败"),
    CLUE_JUDGEMENT_GET_INFO_FAILURE(20017, "获取线索信息失败"),

    CLUE_JUDGEMENT_SUMMARY_CREATE_FAILURE(20018, "添加线索研判结论与分析信息失败"),
    CLUE_JUDGEMENT_SUMMARY_UPDATE_FAILURE(20019, "跟新线索研判结论与分析信息失败"),
    CLUE_JUDGEMENT_SUMMARY_GET_FAILURE(20020, "获取线索研判结论与分析信息失败"),

    CLUE_JUDGEMENT_FAKED_INFO_CREATE_FAILURE(20021, "添加被冒用的真实身份信息失败"),
    CLUE_JUDGEMENT_FAKED_INFO_GET_FAILURE(20022, "获取被冒用的真实身份信息失败"),
    CLUE_JUDGEMENT_FAKED_INFO_UPDATE_FAILURE(20023, "更新被冒用的真实身份信息失败"),
    CLUE_JUDGEMENT_FAKED_INFO_DELETE_FAILURE(20024, "删除被冒用的真实身份信息失败"),

    CLUE_JUDGEMENT_REPORT_CREATE_FAILURE(20025, "添加线索研判结论与分析信息失败"),
    CLUE_JUDGEMENT_REPORT_UPDATE_FAILURE(20026, "跟新线索研判结论与分析信息失败"),
    CLUE_JUDGEMENT_REPORT_GET_FAILURE(20027, "获取线索研判结论与分析信息失败"),
    CLUE_JUDGEMENT_REPORT_LIST_FAILURE(20028, "获取线索研判结论与分析信息失败"),
    CLUE_JUDGEMENT_REPORT_DELETE_FAILURE(20029, "获取线索研判结论与分析信息失败"),

    CLUE_FLOW_LOG_SAVE_FAILURE(30001, "日志信息保存失败"),

    ;

    ApiError(int code, String message) {
        this.code = code;
        this.message = message;
    }


    private final int code;
    private final String message;
    private Object[] parameters = null;

    public ApiError withParams(final Object... parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * 返回枚举值
     * @return
     */
    public int value() {
        return this.code;
    }

    /**
     * 错误信息格式，如果有参数拼接参数
     * @return
     */
    public String getMessage() {
        return (null == parameters) ? message : String.format(message, parameters);
    }

    /**
     * 根据枚举值返回实例
     * @param value
     * @return
     */
    public static ApiError valueOf(int value) {
        if (value >= 1 && value <= ApiError.values().length) {
            return ApiError.values()[value - 1];
        } else {
            return null;
        }
    }


    @Override
    public String toString() {
        return "[" + code + "]: " + message;
    }

    public Object[] getParameters() {
        return parameters;
    }
}

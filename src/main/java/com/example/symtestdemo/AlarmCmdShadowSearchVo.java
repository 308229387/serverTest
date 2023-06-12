/*
 * Copyright (c) 2020, Jugong Technologies and/or its affiliates. All rights reserved.
 */

package com.example.symtestdemo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * @author yaobowen
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AlarmCmdShadowSearchVo {

    /**
     * 在逃编号/身份证号/姓名
     */
    private String inputs;

    /**
     * 数据来源
     */
    private String vendorType;

    /**
     * 上网单位
     */
    private String onLineDepNo;

    /**
     * 上网单位是否包含下级 1 包含 0 不包含
     */
    private int onlineLower;

    /**
     * 潜藏地方
     */
    private String hiddenDepNo;

    /**
     * 潜藏地是否包含下级 1 包含 0 不包含
     */
    private int lurkLower;

    /**
     * 签收状态 待签收、已签收
     */
    private List<String> sign;

    /**
     * 反馈状态 未反馈、已反馈
     */
    private List<String> feedback;

    /**
     * 有效状态 未核实、已核实
     */
    private List<String> proved;

    /**
     * 抓捕状态 未抓获、已抓获
     */
    private List<String> grab;

    /**
     * 有效状态与抓捕状态的关系操作：and, or
     */
    @JsonIgnore
    private String provedGrabOp;

    /**
     * 发生开始时间
     */
    private String occurStartTime;

    /**
     * 发生结束时间
     */
    private String occurEndTime;

    /**
     * 默认当前页
     */
    private Integer pageNo = 1;

    /**
     * 默认每页10条
     */
    private Integer pageSize = 10000;

    /**
     * include judgement report or not.
     */
    private Boolean includeReport = true;

    /**
     * Is all or not.
     */
    private Boolean all = false;

    private int sort;

}
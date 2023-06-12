/*
 * Copyright (c) 2020, Jugong Technologies and/or its affiliates. All rights reserved.
 */
package com.example.symtestdemo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 在逃查询条件
 */
@Data
@ApiModel
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FugitiveBasicInfoDTO {

	@ApiModelProperty("姓名")
	private String name;

	@ApiModelProperty("上网单位代码")
	private String onlineCode;

	@ApiModelProperty("潜藏地单位1")
	private String lurkAddressCode;

	@ApiModelProperty("潜藏地单位2")
	private String lurkAddressCode1;

	@ApiModelProperty("性别")
	private String sex;

	@ApiModelProperty("人员状态 0：在逃人员登记，1：在逃人员撤销，2：在逃人员删除")
	private Integer status;

	@ApiModelProperty("0.按最新轨迹 1.按上网时间")
	private Integer sort;

	@ApiModelProperty("案件类型")
	private String caseType;

	@ApiModelProperty("姓名，身份证号，在逃编号")
	private String keywords;

	@ApiModelProperty("上网时间开始时间")
	private String onlineStartTime;

	@ApiModelProperty("上网时间结束时间")
	private String onlineEndTime;

	@ApiModelProperty("户籍地址名称")
	private String areaCode;

	@ApiModelProperty("立案开始时间")
	private String laStartTime;

	@ApiModelProperty("立案结束时间")
	private String laEndTime;

	@ApiModelProperty("在逃人员类型")
	private String ztryType;

	@ApiModelProperty("上网单位是否包含下级 1 包含 0 不包含")
	private int onlineLower;

	@ApiModelProperty("潜藏地是否包含下级 1 包含 0 不包含")
	private int lurkLower;
	/**
	 * 标签
	 */
	private String labels;

	private String jh;

	private String orgId;

	private String orgName;
	private String sfzh;

	private String userId;

	private String xm;

}

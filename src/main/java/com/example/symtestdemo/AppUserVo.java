package com.example.symtestdemo;

import lombok.Data;

@Data
public class AppUserVo {
	/**
	 * 警号
	 */
	public String jh;
	/**
	 * 单位 code
	 */
	public String orgId;
	/**
	 * 单位名称
	 */
	public String orgName;
	/**
	 * 身份证号
	 */
	public String sfzh;
	/**
	 *
	 */
	public String userId;
	/**
	 * 姓名
	 */
	public String xm;

	/**
	 * 密码
	 */
	private String password;
}

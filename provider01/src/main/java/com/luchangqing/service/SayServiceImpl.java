/**
 * 项目名:mydubbo
 * 包名：com.luchangqing.service
 * 文件名：SayServiceImpl.java
 * 用途：(这里用一句话描述这个方法的作用)
 * 版本信息：1.0
 * 作者：luzq58
 * 日期：2019/4/16 15:12:12
 * Copyright (c) 2019 东方希望集团-版权所有.
 */
package com.luchangqing.service;

import com.luchangqing.common.SayService;

public class SayServiceImpl implements SayService {
	public String hello(String country) {
		String resultStr = "provider01:" + country;
		System.out.println(resultStr+"==========");
		return resultStr;
	}
}

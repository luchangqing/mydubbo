package com.luchangqing.run;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 项目名:mydubbo
 * 包名：PACKAGE_NAME
 * 文件名：com.luchangqing.run.ProviderRun01.java
 * 用途：(这里用一句话描述这个方法的作用)
 * 版本信息：1.0
 * 作者：luzq58
 * 日期：2019/4/16 14:59:59
 * Copyright (c) 2019 东方希望集团-版权所有.
 */

public class ProviderRun01 {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:service.xml");
		ac.start();
		System.in.read();
	}
}

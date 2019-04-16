/**
 * 项目名:mydubbo
 * 包名：com.luchangqing.run
 * 文件名：ConsumerRun01.java
 * 用途：(这里用一句话描述这个方法的作用)
 * 版本信息：1.0
 * 作者：luzq58
 * 日期：2019/4/16 16:19:19
 * Copyright (c) 2019 东方希望集团-版权所有.
 */
package com.luchangqing.run;

import com.luchangqing.common.SayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerRun01 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:consumer.xml");
		ac.start();
		SayService sayService = (SayService)ac.getBean("sayService");
		String luchangqing = sayService.hello("luchangqing");
		System.out.println("ConsumerRun01.main"+ luchangqing);
		ac.close();
	}
}

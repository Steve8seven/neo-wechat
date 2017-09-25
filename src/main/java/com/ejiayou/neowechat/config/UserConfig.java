package com.ejiayou.neowechat.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/*
 * 获取配置参数
 * 也可指定多个配置文件
 * */
@Component
public  class UserConfig {

	@Value("${local.port}")
	private String localPort;
	
	@Value("${tomcat.port:9090}")
	private String tomcatPort;

	public void show() {
		System.out.println("localPort:"+localPort);
	}
	
}

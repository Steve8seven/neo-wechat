package com.ejiayou.neowechat.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("ds")
public class JdbcConfig {

	@Value("${url}")
	private String url;
	
	@Value("${driverClassName}")
	private String driverClassName;
	
	private List<String> hosts = new ArrayList<>();
	
	
	public List<String> getHosts() {
		return hosts;
	}


	public void setHosts(List<String> hosts) {
		this.hosts = hosts;
	}


	public void show() {
		System.out.println("driverClassName:"+driverClassName);
	}


	@Override
	public String toString() {
		return "JdbcConfig [url=" + url + ", driverClassName=" + driverClassName + ", hosts=" + hosts + "]";
	}
	
	
}

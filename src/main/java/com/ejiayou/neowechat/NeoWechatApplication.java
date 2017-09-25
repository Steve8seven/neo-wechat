package com.ejiayou.neowechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@MapperScan("com.ejiayou.neowechat.dao")
public class NeoWechatApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(NeoWechatApplication.class, args);
	}
}

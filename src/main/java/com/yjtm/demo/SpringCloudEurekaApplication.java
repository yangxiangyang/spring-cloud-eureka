package com.yjtm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @author yangxiangyang
 * 2018年9月28日 描述：@EnableEurekaServer用来指定该项目为Eureka的服务注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaApplication.class, args);
	}
}

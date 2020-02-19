package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


/**
 * @auther GeLinBo
 * @date 2019/7/2 22:14
 */

@SpringBootApplication
public class CommunityApplication {


	@PostConstruct
	public void init(){
		//解决netty启动冲突问题    redis和es底层都使用了netty服务
		//看 Netty4Utils.setAvailableProcessors()
		System.setProperty("es.set.netty.runtime.available.processors","false");
	}

	public static void main(String[] args) {

		SpringApplication.run(CommunityApplication.class, args);
	}

}

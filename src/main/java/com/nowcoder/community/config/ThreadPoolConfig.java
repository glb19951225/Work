package com.nowcoder.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author GeLinBo
 * @date 2019/12/19 16:04
 */

@Configuration
@EnableScheduling
@EnableAsync
public class ThreadPoolConfig {
}

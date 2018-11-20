package com.benny.archetype.business;

import com.benny.archetype.common.net.annotations.CommonNetApiScan;
import com.benny.archetype.common.net.annotations.EnableCommonNetClient;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yin.beibei
 * @date 2018/11/20 10:43
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableCommonNetClient
@CommonNetApiScan(basePackages = "com.benny.archetype.business.api.*")
public class BusinessStarter {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BusinessStarter.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);

    }
}

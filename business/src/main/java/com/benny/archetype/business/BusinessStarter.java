package com.benny.archetype.business;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yin.beibei
 * @date 2018/11/20 10:43
 */
@SpringBootApplication
public class BusinessStarter {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BusinessStarter.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);

    }
}

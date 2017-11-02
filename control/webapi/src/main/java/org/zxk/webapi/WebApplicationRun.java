package org.zxk.webapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAsync
@EnableWebMvc
@Configuration
@EnableScheduling
@EnableAutoConfiguration
@EnableAspectJAutoProxy
@SpringBootApplication(scanBasePackages = "org.zxk.*",exclude = MongoAutoConfiguration.class)
@MapperScan("org.zxk.Infrastructure.repository.mybatis")
public class WebApplicationRun {
    public static void main(String[] args){
        SpringApplication.run(WebApplicationRun.class, args);
    }
}

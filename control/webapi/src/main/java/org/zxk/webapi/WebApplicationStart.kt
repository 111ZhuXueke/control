package org.zxk.webapi

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.web.servlet.config.annotation.EnableWebMvc


@EnableAsync
@EnableWebMvc
@Configuration
@EnableScheduling
@EnableAutoConfiguration
@EnableAspectJAutoProxy
@SpringBootApplication(scanBasePackages = arrayOf("org.zxk.*"), exclude = arrayOf(MongoAutoConfiguration::class))
@MapperScan("org.zxk.Infrastructure.repository.mybatis")
open class WebApplicationStart

fun main(args : Array<String>){
    SpringApplication.run(WebApplicationStart :: class, *args)
}
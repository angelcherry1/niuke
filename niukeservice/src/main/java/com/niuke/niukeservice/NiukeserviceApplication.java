package com.niuke.niukeservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = {"com.niuke.niukeservice.listenr"})
@MapperScan(basePackages = {"com.niuke.niukeservice.mapper"})
public class NiukeserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NiukeserviceApplication.class, args);
    }

}

package com.baidu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.github.wusuiwei","com.baidu"})
public class BaiduWebUIAutoTestAppliction {
    public static void main(String[] args) {
        SpringApplication.run(BaiduWebUIAutoTestAppliction.class, args);
    }
}

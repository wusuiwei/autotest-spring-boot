package io.github.wusuiwei.config;

import io.github.wusuiwei.properties.WebUIAutoTestProterties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(WebUIAutoTestProterties.class)
@ComponentScan(basePackages = "io.github.wusuiwei")
public class AutoTestAutoConfiguration {



}

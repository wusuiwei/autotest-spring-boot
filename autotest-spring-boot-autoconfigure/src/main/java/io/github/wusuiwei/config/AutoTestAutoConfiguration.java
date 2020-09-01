package io.github.wusuiwei.config;


import io.github.wusuiwei.selenium.SeleniumAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SeleniumAutoConfiguration.class})
@ComponentScan("io.github.wusuiwei.controller")
public class AutoTestAutoConfiguration {


}

package io.github.wusuiwei.config;


import io.github.wusuiwei.selenium.SeleniumAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SeleniumAutoConfiguration.class,MySelectImports.class})
public class AutoTestAutoConfiguration {


}

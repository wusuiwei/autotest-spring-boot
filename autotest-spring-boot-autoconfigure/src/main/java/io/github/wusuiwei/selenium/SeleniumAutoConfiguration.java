package io.github.wusuiwei.selenium;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({SeleniumProterties.class})
public class SeleniumAutoConfiguration {
}

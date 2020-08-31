package io.github.wusuiwei.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({SeleniumProterties.class, SeleniumProterties.DriverProperties.class})
public class SeleniumAutoConfiguration {
    @Bean("driver")
    public WebDriver getWebdriver() {
        return new ChromeDriver();
    }
}

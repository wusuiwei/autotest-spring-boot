package io.github.wusuiwei.config;


import io.github.wusuiwei.selenium.SeleniumAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Import({SeleniumAutoConfiguration.class})
@ComponentScan("io.github.wusuiwei")
@EnableJpaRepositories(basePackages = "io.github.wusuiwei.dao")
@EntityScan("io.github.wusuiwei.entity")
public class AutoTestAutoConfiguration {


}

package io.github.wusuiwei.config;

import io.github.wusuiwei.properties.WebUIAutoTestProterties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties({WebUIAutoTestProterties.class})
@Import(MySelectImports.class)
public class AutoTestAutoConfiguration {



}

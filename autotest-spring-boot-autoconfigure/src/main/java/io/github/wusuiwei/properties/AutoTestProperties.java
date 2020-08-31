package io.github.wusuiwei.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("autotest")
public class AutoTestProperties {
    private String baseUrl;
}

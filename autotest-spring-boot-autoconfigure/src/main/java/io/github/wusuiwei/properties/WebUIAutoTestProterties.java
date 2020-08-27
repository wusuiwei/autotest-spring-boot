package io.github.wusuiwei.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "autotest.webui")
public class WebUIAutoTestProterties {
    private String name;
}

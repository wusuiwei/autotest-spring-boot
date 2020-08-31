package io.github.wusuiwei.selenium;

import io.github.wusuiwei.properties.AutoTestProperties;
import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.File;
import java.util.List;
import java.util.Map;

@Data
@ConfigurationProperties(prefix = "autotest.selenium")
public class SeleniumProterties extends AutoTestProperties {
    private DriverProperties driver;

    @Data
    public class DriverProperties{
        private Boolean remote=false;
        private String hub;
        private ChromeProperties chrome;
        private EdgeProperties edge;
        private IEProperties ie;
        private FirefoxProerties firefox;
    }

    @Data
    public class ChromeProperties{
        private String platformName;
        private Map<String,String> arguments;
        private List<File> extensions;
        private Boolean headless;
        private String binary_location;

    }

    @Data
    public class EdgeProperties{
        private String platformName;

    }

    @Data
    public class IEProperties{
        private String platformName;

    }

    @Data
    public class FirefoxProerties{
        private String platformName;

    }


}

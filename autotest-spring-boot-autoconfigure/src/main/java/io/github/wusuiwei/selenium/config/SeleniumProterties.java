package io.github.wusuiwei.selenium.config;

import io.github.wusuiwei.properties.AutoTestProperties;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "autotest.selenium")
public class SeleniumProterties extends AutoTestProperties {

    private Integer maxBorserName = 5;
    private Integer caseId;
    private Integer projectId;
    private Integer excuteId;

    @Data
    @ConfigurationProperties(prefix = "autotest.selenium.driver")
    private class DriverProperties{
        private Boolean debug = false;
        private String browserName = BrowserType.CHROME;
        private String location = "";
    }

    @Data
    @ConfigurationProperties(prefix = "autotest.selenium.remote-driver")
    private class RemoteDriverProperteis {
        private String host;
        private String browserName = BrowserType.CHROME;
    }
}

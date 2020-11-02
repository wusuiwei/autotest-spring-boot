package io.github.wusuiwei.selenium.utils;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
public class WebDriverUtil {
    public static WebDriver getDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        try {
            return new RemoteWebDriver(new URL("http://172.20.239.87:4444/wd/hub"), chromeOptions);
        } catch (MalformedURLException e) {
            log.info("打开浏览器失败");
        }
        return null;
    }

    public static void close(WebDriver driver) {
        driver.close();
    }
}
